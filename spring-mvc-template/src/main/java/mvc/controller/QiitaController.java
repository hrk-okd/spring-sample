package mvc.controller;

import lombok.RequiredArgsConstructor;
import mvc.service.QiitaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Qiitaアクセス用のコントローラです。
 */
@Controller
@RequiredArgsConstructor
public class QiitaController {

    /**
     * テストサービスです。
     */
    private final QiitaService qiitaService;

    @RequestMapping(value = "/qiita", method = RequestMethod.GET)
    @ResponseBody
    public String qiita() {
        return qiitaService.execute();
    }

}

