package mvc.service;

import lombok.RequiredArgsConstructor;
import mvc.model.QiitaUserInfo;
import mvc.model.QiitaUserInfoView;
import mvc.repository.IQiitaRepository;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

/**
 * Qiitaアクセス用のサービスです。
 */
@Service
@RequiredArgsConstructor
public class QiitaService {

    /**
     * Qiitaアクセス用リポジトリです。
     */
    private final IQiitaRepository qiitaRepository;

    /**
     * 処理を実行します。
     *
     * @return 実行結果
     */
    public String execute() {
        QiitaUserInfo userInfo = qiitaRepository.getUserInfo("hrk_okd");
        if (isNull(userInfo)) {
            return null;
        }

        QiitaUserInfoView userInfoView = QiitaUserInfoView.builder()
                .id(userInfo.getId())
                .itemsCount(userInfo.getItemsCount())
                .websiteUrl(userInfo.getWebsiteUrl())
                .build();

        return userInfoView.toString();
    }
}
