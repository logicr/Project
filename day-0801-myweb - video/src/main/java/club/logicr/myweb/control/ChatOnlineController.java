package club.logicr.myweb.control;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

/**
 * @author Jan on 2018/8/13.
 * @version 1.0
 */
//@RestController
@RequestMapping
@Controller
public class ChatOnlineController {

    private final String  APIKEY = "8d6520f315f84686b3a6cbc119e82c25";
    //处理数据发送和接收
    /**
     * RestTemplate来帮我发送请求
     */
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Gson gosn;


    @RequestMapping(value = {"/testChat"}, method = {RequestMethod.GET})
    public String chatOnline() {
        return "/WEB-INF/views/onlineChat/testChat";
    }
    //处理前端请求

    @RequestMapping(value = {"/chat"},method = {RequestMethod.POST})
    public void chat(@RequestParam(value = "info") String info,
                     HttpServletRequest request
                     ) {
        request.setAttribute("msg",getDate(info));
    }

    public String getDate(String info) {
//        String info = URLEncoder.encode(question, "utf-8");
        try {
            info = new String(info.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String URL = "http://www.tuling123.com/openapi/api?key=" + APIKEY + "&info=" + info;
        ResponseEntity<JsonObject> responseEntity =
                restTemplate.getForEntity(URL, JsonObject.class);
        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            /*return*/
            JsonObject entityBody = responseEntity.getBody();
            String msg = entityBody.get("text").getAsString();
            return msg;
        } else {
            throw new RuntimeException("链接失败");
        }
    }





















    public void data(String question) throws IOException {
             final String  APIKEY = "8d6520f315f84686b3a6cbc119e82c25";


//            String question = "hello?";
//            String question = scanner.nextLine();
            String info = URLEncoder.encode(question, "utf-8");
            String getURL = "http://www.tuling123.com/openapi/api?key=" + APIKEY + "&info=" + info;
            URL url = new URL(getURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder ret = new StringBuilder();
            String getInfo = "";
            while ((getInfo = reader.readLine()) != null) {
                ret.append(getInfo);
            }
            reader.close();
            connection.disconnect();
            System.out.println(ret.toString());
        }
}
