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
 * 注册方法，应当有get、post方法
 * @author Jan on 2018/8/7.
 * @version 1.0
 */
@Controller
@RequestMapping
public class RegisterController {
    public static final int PASS_MAX = 16;
    public static final int PASS_MIN= 6;
    @Autowired
    private UserService userService;
    /*若请求注册页面，返回*/
    @RequestMapping(value = {"/register"}, method = {RequestMethod.GET})
    public  String register() {
        return "/WEB-INF/views/userservice/register";
    }
    /*业务逻辑：将传入的帐号和密码存入到数据库中*/
    @RequestMapping(value = {"/register"}, method = {RequestMethod.POST})
    /*用注解代替HttpServlet*/
    public ModelAndView register(
            @RequestParam("username") String username,
            @RequestParam("password" ) String password,
            @RequestParam("repassword" ) String repassword,
            HttpSession session
                                   ) {
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        try {
            /*处理牛皮癣*/
            username = new String(username.getBytes("ISO-8859-1"), "UTF-8");
            password = new String(password.getBytes("ISO-8859-1"), "UTF-8");
            repassword = new String(repassword.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        user.setUsername(username);
        user.setPassword(password);
        /*检测编码*/
        //System.out.println(user.getUsername());
        if (null == username || null == password ||username.length() ==0 || password.length()==0) {
            modelAndView.addObject("error", "用户名或密码为空");
        } else if (userService.exist(user)) {
            /* 用户名检测 存在于不存在 */
            modelAndView.addObject("error", "该用户已存在");

        } else if (!password.equals(repassword)) {
            modelAndView.addObject("error", "两次密码不一致");

//        } else if (password.length() < 6 ) {
        } else if (password.length() < PASS_MIN ) {
            modelAndView.addObject("error","密码不能少于6位");
//        }else if (password.length() < 16 ) {
        }else if (password.length() > PASS_MAX ) {
            modelAndView.addObject("error", "密码长度不能超过16位");
        }
        else if (userService.register(user)) {
            session.setAttribute("current_user", username);
            modelAndView.setViewName("/WEB-INF/views/home/video");
            return modelAndView;
        } else {
            modelAndView.addObject("error", "输入有误");
        }
        modelAndView.setViewName("/WEB-INF/views/userservice/register");
        return modelAndView;
    }

}
