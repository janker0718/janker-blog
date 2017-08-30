package cc.janker.opensource.blog.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by zhiyongliu3 on 2017/8/30.
 */
@Controller
public class TestController {
    /**
     * 返回html模板.
     */
    @RequestMapping("/hello")
    public String helloHtml(Map<String,Object> map){

        map.put("hello","java");
        return"/test";
    }
}
