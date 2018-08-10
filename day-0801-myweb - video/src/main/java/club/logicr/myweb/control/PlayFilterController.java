package club.logicr.myweb.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 检测是否登录，没有登录则跳转登录界面，
 * 已登录则跳转播放界面
 * 每个方法返回一个对应电影页面
 *
 * @author Jan on 2018/8/2.
 * @version 1.0
 */
@Controller
@RequestMapping
public class PlayFilterController {
    /**
     * 如果有xxx.video.html的请求，验证登录，如果已经登录，返回video
     */
    @RequestMapping(value = {"/xihongshi"}, method = {RequestMethod.GET})
    public ModelAndView login(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        Object account = session.getAttribute("current_user");
        if (null != account) {
            modelAndView.setViewName("/WEB-INF/views/video/xihongshi");
            return modelAndView;
        } else {
            modelAndView.setViewName("/WEB-INF/views/userservice/login");
            return modelAndView;
        }
    }

    @RequestMapping(value = {"/direnjie"}, method = {RequestMethod.GET})
    public ModelAndView login2(  HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        Object account = session.getAttribute("current_user");
        if (null != account) {
            modelAndView.setViewName("/WEB-INF/views/video/direnjie");
            return modelAndView;
        } else {
            modelAndView.setViewName("/WEB-INF/views/userservice/login");
            return modelAndView;
        }
    }

    @RequestMapping(value = {"/sousuo"}, method = {RequestMethod.GET})
    public ModelAndView login3(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        Object account = session.getAttribute("current_user");
        if (null != account) {
            modelAndView.setViewName("/WEB-INF/views/video/sousuo");
            return modelAndView;
        } else {
            modelAndView.setViewName("/WEB-INF/views/userservice/login");
            return modelAndView;
        }
    }

    @RequestMapping(value = {"/dongwushijie"}, method = {RequestMethod.GET})
    public ModelAndView login4(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession();
        Object account = session.getAttribute("current_user");
        if (null != account) {
            modelAndView.setViewName("/WEB-INF/views/video/dongwushijie");
            return modelAndView;
        } else {
            modelAndView.setViewName("/WEB-INF/views/userservice/login");
            return modelAndView;
        }
    }
    @RequestMapping(value = {"/xie"}, method = {RequestMethod.GET})
    public ModelAndView xie(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession();
        Object account = session.getAttribute("current_user");
        if (null != account) {
            modelAndView.setViewName("/WEB-INF/views/video/xie");
            return modelAndView;
        } else {
            modelAndView.setViewName("/WEB-INF/views/userservice/login");
            return modelAndView;
        }
    }

    @RequestMapping(value = {"/fuchouzhe3"}, method = {RequestMethod.GET})
    public ModelAndView fuchouzhe3(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession();
        Object account = session.getAttribute("current_user");
        if (null != account) {
            modelAndView.setViewName("/WEB-INF/views/video/fuchouzhe3");
            return modelAndView;
        } else {
            modelAndView.setViewName("/WEB-INF/views/userservice/login");
            return modelAndView;
        }
    }

}
