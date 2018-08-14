package club.logicr.myweb.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Jan on 2018/8/11.
 * @version 1.0
 */
@Component
public class TimeTaskController {
    @Autowired
    protected JavaMailSender mailSender;
    @Scheduled(cron = "0 */1 * * * ?")
    public void taskTest() {
        System.out.println("++++++++++test++++++++");
        System.out.println("时间飞逝，又过了一分钟");
//        try {
//            setMailSender("时间飞逝，又过了一分钟");
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
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
        String time = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").format(new Date());
        mimeMessage.setSubject("来自网站的mail");
        mimeMessage.setText(text+": "+time);
        mailSender.send(mimeMessage);
    }
}
