package top.lucius.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lucius.model.ImMember;
import top.lucius.model.ImMemberExample;

public interface ImMemberMapper {
    int countByExample(ImMemberExample example);

    int deleteByExample(ImMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImMember record);

    int insertSelective(ImMember record);

    List<ImMember> selectByExample(ImMemberExample example);

    ImMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImMember record, @Param("example") ImMemberExample example);

    int updateByExample(@Param("record") ImMember record, @Param("example") ImMemberExample example);

    int updateByPrimaryKeySelective(ImMember record);

    int updateByPrimaryKey(ImMember record);
}