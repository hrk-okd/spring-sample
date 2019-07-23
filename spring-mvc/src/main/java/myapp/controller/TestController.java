package myapp.controller;

import lombok.RequiredArgsConstructor;
import myapp.service.ITestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * テスト用のコントローラです。
 */
@Controller
@RequiredArgsConstructor
public class TestController {

    /**
     * テストサービスです。
     */
    private final ITestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return testService.execute();
    }
}

