package com.zmkj.wnlt.controller;

import com.zmkj.wnlt.domain.Message;
import com.zmkj.wnlt.domain.Phone;
import com.zmkj.wnlt.domain.User;
import com.zmkj.wnlt.service.MessageService;
import com.zmkj.wnlt.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * message接口
 */
@RestController
@RequestMapping("/api/v1/message")
public class MessageController {


    @Autowired
    private MessageService messageService;
    @Autowired
    private PhoneService phoneService;




    /**
     * 保存
     * @param
     * @return
     */
    @PostMapping("save")
    @ResponseBody
    public Object find(@RequestParam(value="dhh",required=true) String dhh,@RequestParam(value="mId",required=true) Integer mId, @RequestParam(value="xm",required=true) String xm,@RequestParam(value="addr",required=true) String addr, @RequestParam(value="tel",required=true) String tel,@RequestParam(value="userId",required=true) Integer userId){
        Map<String,Object> map = new HashMap<>();
        Message msg = new Message();
        msg.setXm(xm);
        msg.setTel(tel);
        msg.setDhh(dhh);
        msg.setAddr(addr);
        msg.setMId(mId);
        msg.setUserId(userId);
        List<Message> list = messageService.findMsg(dhh);
        if(list!=null && list.size()>0  ){
            map.put("data","0");
            return map;
        }
        int data = messageService.updateMsg(msg);
        //留言提交，同时修改这个号状态为Y
        if(data > 0){
            Phone ph=new Phone();
            ph.setDelFlag("Y");
            ph.setDhh(msg.getDhh());
            phoneService.update(ph);
            map.put("data",data);
            return map;
        }
        map.put("data",data);
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "partIn", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public Object all(@RequestParam(value="phone",required=true) String phone) {
       Message message = new Message();
       message.setPhone(phone);
       int data =  messageService.save(message);
       return data;
    }

    @ResponseBody
    @RequestMapping(value = "addUser", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public Object addUser(@RequestParam(value="username",required=true) String username,@RequestParam(value="tel",required=true) String tel) {
        User user = new User();
        user.setUsername(username);
        user.setTel(tel);
        int data =  messageService.addUser(user);
        return data;
    }
}
