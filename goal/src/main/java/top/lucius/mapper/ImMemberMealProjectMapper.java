package top.lucius.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lucius.model.ImMemberMealProject;
import top.lucius.model.ImMemberMealProjectExample;

public interface ImMemberMealProjectMapper {
    int countByExample(ImMemberMealProjectExample example);

    int deleteByExample(ImMemberMealProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImMemberMealProject record);

    int insertSelective(ImMemberMealProject record);

    List<ImMemberMealProject> selectByExample(ImMemberMealProjectExample example);

    ImMemberMealProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImMemberMealProject record, @Param("example") ImMemberMealProjectExample example);

    int updateByExample(@Param("record") ImMemberMealProject record, @Param("example") ImMemberMealProjectExample example);

    int updateByPrimaryKeySelective(ImMemberMealProject record);

    int updateByPrimaryKey(ImMemberMealProject record);
}