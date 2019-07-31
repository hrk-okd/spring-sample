package myapp.service.impl;

import myapp.repository.ITestRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

/**
 * {@link TestService} のテストクラスです。
 */
@ExtendWith(MockitoExtension.class)
class TestServiceTest {

    private TestService target;

    @Mock
    private ITestRepository repository;

    @BeforeEach
    void before() {
        target = spy(new TestService(repository));
    }

    @Test
    void execute() {
        String expected = "result";
        when(repository.execute()).thenReturn(expected);

        String actual = target.execute();

        assertThat(actual).isEqualTo(expected);
    }
}
