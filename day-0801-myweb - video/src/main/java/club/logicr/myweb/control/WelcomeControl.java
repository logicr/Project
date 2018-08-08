package club.logicr.myweb.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

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
        modelAndView.setViewName("video");
        return modelAndView;
    }
}
