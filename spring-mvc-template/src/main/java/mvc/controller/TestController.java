package mvc.controller;

import lombok.RequiredArgsConstructor;
import mvc.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    private final TestService testService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return testService.execute();
    }

}

