package top.lucius.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lucius.model.ImMeal;
import top.lucius.model.ImMealExample;

public interface ImMealMapper {
    int countByExample(ImMealExample example);

    int deleteByExample(ImMealExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImMeal record);

    int insertSelective(ImMeal record);

    List<ImMeal> selectByExample(ImMealExample example);

    ImMeal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImMeal record, @Param("example") ImMealExample example);

    int updateByExample(@Param("record") ImMeal record, @Param("example") ImMealExample example);

    int updateByPrimaryKeySelective(ImMeal record);

    int updateByPrimaryKey(ImMeal record);
}