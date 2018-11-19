package com.zmkj.wnlt.mapper;

import com.zmkj.wnlt.domain.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.zmkj.wnlt.domain.User;

import java.util.List;

/**
 * message数据访问层
 */
@Mapper
public interface MessageMapper {





//    @Insert("INSERT INTO `message` ( `M_ID`, `phone`, " +
//            "`create_time`)" +
//            "VALUES" +
//            "(#{mId}, #{phone},now())")
//    @Options(useGeneratedKeys=true, keyProperty="M_ID", keyColumn="M_ID")
    int save(Message message);

    @Select("select dhh,xm,tel,addr from message where dhh = #{dhh}")
    List<Message> findMsg(String dhh);

    @Update("update `message` set dhh = #{dhh},tel = #{tel},xm = #{xm},addr = #{addr},isPartIn = 'Y',userId=#{userId},update_time = now() where M_ID = #{mId}")
    int updateMsg(Message message);

    int addUser(User user);
}
