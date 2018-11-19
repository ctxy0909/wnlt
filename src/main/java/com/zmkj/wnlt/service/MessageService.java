package com.zmkj.wnlt.service;

import com.zmkj.wnlt.domain.Message;
import com.zmkj.wnlt.domain.User;

import java.util.List;

/**
 * 留言业务类接口
 */
public interface MessageService {



    int save(Message message);

    List<Message> findMsg(String tel);

    int updateMsg(Message message);

    int addUser(User user);

}
