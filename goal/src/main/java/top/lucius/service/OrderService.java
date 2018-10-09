package top.lucius.service;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import top.lucius.model.ImOrder;

import java.util.List;

/**
 * Created on 2018/5/8 0008.
 *
 * @author lucius
 */
public interface OrderService {
    public PageInfo<ImOrder> getOrderList(Integer shopId, Integer page, Integer pageSize);
}
