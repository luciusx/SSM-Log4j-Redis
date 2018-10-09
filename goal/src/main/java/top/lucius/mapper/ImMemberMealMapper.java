package top.lucius.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lucius.model.ImMemberMeal;
import top.lucius.model.ImMemberMealExample;

public interface ImMemberMealMapper {
    int countByExample(ImMemberMealExample example);

    int deleteByExample(ImMemberMealExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImMemberMeal record);

    int insertSelective(ImMemberMeal record);

    List<ImMemberMeal> selectByExample(ImMemberMealExample example);

    ImMemberMeal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImMemberMeal record, @Param("example") ImMemberMealExample example);

    int updateByExample(@Param("record") ImMemberMeal record, @Param("example") ImMemberMealExample example);

    int updateByPrimaryKeySelective(ImMemberMeal record);

    int updateByPrimaryKey(ImMemberMeal record);
}