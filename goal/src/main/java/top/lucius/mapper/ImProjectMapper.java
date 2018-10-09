package top.lucius.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lucius.model.ImProject;
import top.lucius.model.ImProjectExample;

public interface ImProjectMapper {
    int countByExample(ImProjectExample example);

    int deleteByExample(ImProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImProject record);

    int insertSelective(ImProject record);

    List<ImProject> selectByExample(ImProjectExample example);

    ImProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImProject record, @Param("example") ImProjectExample example);

    int updateByExample(@Param("record") ImProject record, @Param("example") ImProjectExample example);

    int updateByPrimaryKeySelective(ImProject record);

    int updateByPrimaryKey(ImProject record);
}