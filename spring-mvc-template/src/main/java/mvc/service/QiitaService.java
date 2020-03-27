package mvc.service;

import lombok.RequiredArgsConstructor;
import mvc.model.QiitaUserInfo;
import mvc.repository.IQiitaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
        return Optional.ofNullable(qiitaRepository.getUserInfo("hrk_okd"))
                .map(QiitaUserInfo::toString)
                .orElse(null);
    }
}
