package club.logicr.myweb.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * 免登陆测试
 * @author Jan on 2018/8/7.
 * @version 1.0
 */
@Controller
@RequestMapping
public class TestController {
    @RequestMapping(value = {"test"}, method = {RequestMethod.GET})
    public String test(HttpSession session) {
         session.setAttribute("current_user","Test");
        return "/WEB-INF/views/home/video";
    }
}
