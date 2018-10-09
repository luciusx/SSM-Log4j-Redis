package top.lucius.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lucius.mapper.ImOrderMapper;
import top.lucius.model.ImOrder;
import top.lucius.model.ImOrderExample;
import top.lucius.service.OrderService;

import java.util.List;


/**
 * Created on 2018/5/8 0008.
 *
 * @author lucius
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    ImOrderMapper imOrderMapper;

    @Override
    public PageInfo<ImOrder> getOrderList(Integer shopId, Integer pageNO, Integer pageSize) {
        ImOrderExample oe = new ImOrderExample();
        oe.createCriteria().andShopIdEqualTo(shopId).andStatusEqualTo(2);
        PageHelper.startPage(pageNO,pageSize);
        com.github.pagehelper.Page<ImOrder> list = (com.github.pagehelper.Page<ImOrder>)imOrderMapper.selectByExample(oe);

        PageInfo<ImOrder> inf = new PageInfo<>(list);
        return inf;
    }
}
