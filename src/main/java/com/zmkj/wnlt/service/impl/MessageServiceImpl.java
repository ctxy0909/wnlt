package com.zmkj.wnlt.service.impl;

import com.zmkj.wnlt.domain.Message;
import com.zmkj.wnlt.domain.User;
import com.zmkj.wnlt.mapper.MessageMapper;
import com.zmkj.wnlt.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;


    @Override
    public int save(Message message) {
        int rows = messageMapper.save(message);
        if(rows > 0){
            return message.getTempId();
        }
        return rows;
    }
    @Override
    public List<Message> findMsg(String tel){
      List<Message> list = messageMapper.findMsg(tel);
      return list;
    };

    @Override
    public int updateMsg(Message message){
       int data =  messageMapper.updateMsg(message);
        return data;
    };

    @Override
    public int addUser(User user){
        int data =  messageMapper.addUser(user);
        if(data>0){
            return user.getTempId();
        }
        return data;
    };

}
