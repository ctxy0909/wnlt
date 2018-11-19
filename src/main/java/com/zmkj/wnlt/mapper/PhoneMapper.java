package com.zmkj.wnlt.mapper;

import com.zmkj.wnlt.domain.Phone;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * video数据访问层
 */

@Mapper
public interface PhoneMapper {

    List<Phone> findAll();
    @Select("SELECT dhh,tclx FROM phone WHERE  tclx = #{tclx} and del_flag = 'N'order by rand() limit 14")
    List<Phone> findByIds(String tclx);

    @Update("update phone set del_flag=#{delFlag} where dhh=#{dhh}")
    int update(Phone phone);

    //@Select("select dhh,tclx from phone WHERE del_flag = 'N' and DHH like CONCAT('%',#{dhh},'%')")
    List<Phone> findType(Phone phone);


    //@Select("select dhh,tclx from phone where DHH like CONCAT('%',#{dhh},'%') and tclx = #{tclx}")
    List<Phone> find(Phone phone);

}
