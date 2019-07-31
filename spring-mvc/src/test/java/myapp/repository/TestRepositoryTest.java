package myapp.repository;

import myapp.repository.impl.TestRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.spy;

/**
 * {@link TestRepository} のテストクラスです。
 */
@ExtendWith(MockitoExtension.class)
class TestRepositoryTest {

    private TestRepository target;

    @BeforeEach
    void before() {
        target = spy(new TestRepository());
    }

    @Test
    void execute() {
        String actual = target.execute();

        assertThat(actual).isNotNull();
    }
}
