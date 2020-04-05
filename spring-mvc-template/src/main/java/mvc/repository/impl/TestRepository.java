package mvc.repository.impl;

import lombok.RequiredArgsConstructor;
import mvc.module.IApiExecutor;
import mvc.repository.ITestRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * テスト用のリポジトリです。
 */
@Repository
@RequiredArgsConstructor
public class TestRepository implements ITestRepository {

    /**
     * API実行クラスです。
     */
    private final IApiExecutor apiExecutor;

    /**
     * {@inheritDoc}
     */
    @Override
    public String execute() {
        String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        return "TestRepository#execute - " + nowTime;
    }
}
