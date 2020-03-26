package mvc.service;

import lombok.RequiredArgsConstructor;
import mvc.repository.IQiitaRepository;
import org.springframework.stereotype.Service;

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
        return qiitaRepository.get("hrk_okd");
    }
}
