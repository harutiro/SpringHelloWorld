package io.github.harutiro.SpringHelloWorld.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    // GET //
    @GetMapping("/")
    @ResponseBody  //戻り値がそのままレスポンスになる
    public String index(){
        return "<h1>Hello,World!!</h1>";
    }
}
