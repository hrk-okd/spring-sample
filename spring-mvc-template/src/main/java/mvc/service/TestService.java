package mvc.service;

import lombok.RequiredArgsConstructor;
import mvc.repository.ITestRepository;
import org.springframework.stereotype.Service;

/**
 * テスト用のサービスです。
 */
@Service
@RequiredArgsConstructor
public class TestService {

    /**
     * テスト用リポジトリです。
     */
    private final ITestRepository testRepository;

    /**
     * 処理を実行します。
     *
     * @return 実行結果
     */
    public String execute() {
        return testRepository.execute();
    }
}
