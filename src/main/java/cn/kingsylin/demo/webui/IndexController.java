package cn.kingsylin.demo.webui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping
    public String welcome(){
        return "hello world!";
    }
}
