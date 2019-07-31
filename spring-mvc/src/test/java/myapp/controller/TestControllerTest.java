package myapp.controller;

import myapp.service.ITestService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.spy;

/**
 * {@link TestController} のテストクラスです。
 */
@ExtendWith(MockitoExtension.class)
class TestControllerTest {

    private TestController target;

    @Mock
    private ITestService testService;

    @BeforeEach
    void before() {
        target = spy(new TestController(testService));
    }

    @Test
    void execute() {
        String actual = target.test();
        assertThat(actual).isNull();
    }
}
