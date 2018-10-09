package top.lucius.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lucius.model.ImOrderProject;
import top.lucius.model.ImOrderProjectExample;

public interface ImOrderProjectMapper {
    int countByExample(ImOrderProjectExample example);

    int deleteByExample(ImOrderProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImOrderProject record);

    int insertSelective(ImOrderProject record);

    List<ImOrderProject> selectByExample(ImOrderProjectExample example);

    ImOrderProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImOrderProject record, @Param("example") ImOrderProjectExample example);

    int updateByExample(@Param("record") ImOrderProject record, @Param("example") ImOrderProjectExample example);

    int updateByPrimaryKeySelective(ImOrderProject record);

    int updateByPrimaryKey(ImOrderProject record);
}