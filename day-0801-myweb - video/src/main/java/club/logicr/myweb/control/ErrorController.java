package club.logicr.myweb.control;

import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.net.BindException;

/**
 * 用来弄错误页面的，不成功，在web.xml配置了错误页面
 * @author Jan on 2018/8/10.
 * @version 1.0
 */
@Controller
@ControllerAdvice
public class ErrorController {

//    @ExceptionHandler(value = {BindException.class,NoHandlerFoundException.class,TypeMismatchException.class})
    @ExceptionHandler(org.springframework.web.servlet.NoHandlerFoundException.class)
    public String error404() {
        return "error";
    }
//    public ModelAndView  error404(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("error", "404");
//        modelAndView.setViewName("/WEB-INF/views/error/error");
//        return modelAndView;
//    }
}
