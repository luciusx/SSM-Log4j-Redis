package top.lucius.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lucius.model.ImOrder;
import top.lucius.model.ImOrderExample;

public interface ImOrderMapper {
    int countByExample(ImOrderExample example);

    int deleteByExample(ImOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImOrder record);

    int insertSelective(ImOrder record);

    List<ImOrder> selectByExample(ImOrderExample example);

    ImOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImOrder record, @Param("example") ImOrderExample example);

    int updateByExample(@Param("record") ImOrder record, @Param("example") ImOrderExample example);

    int updateByPrimaryKeySelective(ImOrder record);

    int updateByPrimaryKey(ImOrder record);
}