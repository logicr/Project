package club.logicr.myweb.control;

import club.logicr.myweb.entity.User;
import club.logicr.myweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

/**
 * @author Jan on 2018/8/4.
 * @version 1.0
 */
@Controller
@RequestMapping
public class LoginController {
    @Autowired
    private UserService userService;
    /*业务逻辑：将传入的帐号和密码存入到数据库中*/


    /**
     * 登录get
     *
     * @return
     */
    @RequestMapping(value = {"/userLogin"}, method = {RequestMethod.GET})
    public String login() {
        return "/WEB-INF/views/userservice/login";
    }


    @RequestMapping(value = {"/userLogin"}, method = {RequestMethod.POST})
    /*用注解代替HttpServlet*/
    public ModelAndView loginMysql(
            @RequestParam("username") String username,
            @RequestParam("password" ) String password,
            HttpSession session
                                   ) {
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        try {
            username = new String(username.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        user.setUsername(username);
        user.setPassword(password);
        if (null == username || null == password ||username.length() ==0 || password.length()==0) {
            modelAndView.addObject("error", "用户名或密码为空");
        }else if(userService.login(user)) {
            session.setAttribute("current_user",username);
            modelAndView.setViewName("/WEB-INF/views/home/video");
            return modelAndView;
        }else {
            modelAndView.addObject("error", "用户名或密码错误");
        }
        modelAndView.setViewName("/WEB-INF/views/userservice/login");
        return modelAndView;
    }

}
