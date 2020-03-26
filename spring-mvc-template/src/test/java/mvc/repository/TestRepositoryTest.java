package mvc.repository;

import mvc.module.IApiExecutor;
import mvc.repository.impl.TestRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.spy;

/**
 * {@link TestRepository} のテストクラスです。
 */
@ExtendWith(MockitoExtension.class)
class TestRepositoryTest {

    private TestRepository target;

    @Mock
    IApiExecutor apiExecutor;

    @BeforeEach
    void before() {
        target = spy(new TestRepository(apiExecutor));
    }

    @Test
    void execute() {
        String actual = target.execute();

        assertThat(actual).isNotNull();
    }
}
