package club.logicr.myweb.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;


/**
 * @author Jan on 2018/8/10.
 * @version 1.0
 */
@Controller
//@RestController
@RequestMapping
public class AboutController {


    @Autowired
    private JavaMailSender mailSender;
    @RequestMapping(value = {"/about"},method = {RequestMethod.GET})
    public String about(){
        return "/WEB-INF/views/about/about";
    }

    @RequestMapping(value = {"mail"},method = {RequestMethod.POST})
    public ModelAndView sendMail(@RequestParam(value = "text") String text){
        ModelAndView modelAndView = new ModelAndView();
        if (null == text || text.length() ==0) {
            modelAndView.addObject("msg", "未输入任何消息");
            modelAndView.setViewName("/WEB-INF/views/about/about");
            return modelAndView;
        }
        try {
            text = new String(text.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            setMailSender(text);
            modelAndView.addObject("msg", "信息已成功发送");
            modelAndView.setViewName("/WEB-INF/views/about/about");
            return modelAndView;
        } catch (MessagingException e) {
            modelAndView.addObject("msg", "信息已发送失败");
            modelAndView.setViewName("/WEB-INF/views/about/about");
            return modelAndView;
        }
    }

    public void setMailSender(String text) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        mimeMessage.setRecipient(
                Message.RecipientType.TO,
//                new InternetAddress("511553161@qq.com")
                new InternetAddress("13314433445@163.com")
        );
        mimeMessage.setFrom(
//                new InternetAddress("13314433445@163.com")
                new InternetAddress("511553161@qq.com")
        );
        mimeMessage.setSubject("来自网站的mail");
        mimeMessage.setText(text);
        mailSender.send(mimeMessage);
    }
}
