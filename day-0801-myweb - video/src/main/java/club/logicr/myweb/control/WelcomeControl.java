package club.logicr.myweb.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 欢迎页面访问就跳转至该页面
 * @author Jan on 2018/8/4.
 * @version 1.0
 */

@Controller
@RequestMapping
public class WelcomeControl {

    /**
     * 空和video就返回video（主页）
     * @return
     */
    @RequestMapping(value = {"","/video"},method = {RequestMethod.GET})
    public ModelAndView getLogin(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/views/home/video");
        return modelAndView;
    }
}
