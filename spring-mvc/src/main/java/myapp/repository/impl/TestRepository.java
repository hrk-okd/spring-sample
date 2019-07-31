package myapp.repository.impl;

import myapp.repository.ITestRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * テスト用のリポジトリです。
 */
@Repository
public class TestRepository implements ITestRepository {

    /**
     * {@inheritDoc}
     */
    @Override
    public String execute() {
        String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        return "TestRepository#execute - " + nowTime;
    }
}
