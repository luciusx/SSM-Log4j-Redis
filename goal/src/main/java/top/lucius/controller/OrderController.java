package top.lucius.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import top.lucius.mapper.ImOrderMapper;
import top.lucius.model.ImOrder;
import top.lucius.model.ImOrderExample;
import top.lucius.service.OrderService;
import top.lucius.utils.RedisUtils;
import top.lucius.utils.SpringUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.logging.Logger;

/**
 * Created on 2018/5/7 0007.
 *
 * @author lucius
 */
@RequestMapping("/order")
@Controller
public class OrderController {

    public SerializerFeature[] serializerFeatures = null;
    public ValueFilter filter = null;

    Logger log = Logger.getLogger(getClass().getName());

    @Autowired
    OrderService orderService;

    @Autowired
    ImOrderMapper imOrderMapper;

    @RequestMapping("/index")
    public ModelAndView index(){
        //logger test
        log.info("这只是一个logger测试");

        RedisUtils util = SpringUtil.getBean("redisUtil",RedisUtils.class);
        util.set("abc",123, 1326545646);

        Object name = util.get("abc");
        log.info(name.toString());

        ModelMap mm = new ModelMap();
        mm.put("name","张三");
        ModelAndView mav = new ModelAndView("index",mm);
        return mav;
    }

    @ResponseBody
    @RequestMapping("/list")
    public String list(HttpServletRequest request,Integer rows,Integer page){

        ImOrderExample example = new ImOrderExample();
        example.createCriteria().andShopIdEqualTo(2);
        PageInfo<ImOrder> data = orderService.getOrderList(2,page,rows);
        JSONObject obj = new JSONObject();

        Enumeration arr = request.getParameterNames();
//        Iterator it =

        obj.put("total",data.getTotal());
        obj.put("rows",data.getList());
        return obj.toString();
    }

    @RequestMapping("/detail")
    public ModelAndView detail(Integer id){
        ImOrder imOrder = imOrderMapper.selectByPrimaryKey(1);
        ModelMap mm = new ModelMap();
        mm.put("data",imOrder);
        ModelAndView mv = new ModelAndView("detail",mm);
        return  mv;
    }

    @RequestMapping("/edit")
    public ModelAndView edit(Integer id){
        ImOrder imOrder = imOrderMapper.selectByPrimaryKey(1);
        ModelMap mm = new ModelMap();
        mm.put("data",imOrder);
        ModelAndView mv = new ModelAndView("edit",mm);
        return  mv;
    }

//    @ResponseBody
//    @RequestMapping("/save")
//    public String save(){
//        List<ImOrder> data = orderService.getOrderList(2,2,1);
//        JSONObject obj = new JSONObject();
//
//        obj.put("success",true);
//        return obj.toString();
//    }
//
//    @ResponseBody
//    @RequestMapping("/update")
//    public String update(){
//        List<ImOrder> data = orderService.getOrderList(2,2,1);
//        JSONObject obj = new JSONObject();
//
//        obj.put("success",true);
//        return obj.toString();
//    }
//
//    @ResponseBody
//    @RequestMapping("/remove")
//    public String remove(HttpServletRequest request){
//        List<ImOrder> data = orderService.getOrderList(2,2,1);
//        JSONObject obj = new JSONObject();
//        obj.put("success",true);
//        return obj.toString();
//    }
}
