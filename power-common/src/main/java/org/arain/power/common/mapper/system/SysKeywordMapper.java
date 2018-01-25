package org.arain.power.common.mapper.system;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.arain.power.common.pojo.system.SysKeyword;
import org.arain.power.common.pojo.system.SysKeywordExample;

public interface SysKeywordMapper {
    int countByExample(SysKeywordExample example);

    int deleteByExample(SysKeywordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysKeyword record);

    int insertSelective(SysKeyword record);

    List<SysKeyword> selectByExample(SysKeywordExample example);

    SysKeyword selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysKeyword record, @Param("example") SysKeywordExample example);

    int updateByExample(@Param("record") SysKeyword record, @Param("example") SysKeywordExample example);

    int updateByPrimaryKeySelective(SysKeyword record);

    int updateByPrimaryKey(SysKeyword record);
}