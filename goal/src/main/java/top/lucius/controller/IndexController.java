package top.lucius.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import top.lucius.service.OrderService;

/**
 * Created on 2018/5/11 0011.
 *
 * @author lucius
 */
@RequestMapping("index")
public class IndexController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
