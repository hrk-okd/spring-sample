package myapp.service.impl;

import lombok.RequiredArgsConstructor;
import myapp.repository.ITestRepository;
import myapp.service.ITestService;
import org.springframework.stereotype.Service;

/**
 * テスト用のサービスです。
 */
@Service
@RequiredArgsConstructor
public class TestService implements ITestService {

    /**
     * テスト用リポジトリです。
     */
    private final ITestRepository testRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public String execute() {
        return testRepository.execute();
    }
}
