package com.zmkj.wnlt.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zmkj.wnlt.domain.Phone;
import com.zmkj.wnlt.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @ClassName:  PhoneController
 * @Description:TODO(phone接口)
 * @author: ct
 * @date:

 */
@RestController
@RequestMapping("/api/v1/phone")
public class PhoneController {

	@Autowired
	private PhoneService phoneService;
	
	
	
	/**
	 * @Title: pageVideo
	 * @Description: TODO(& # x5206 ; & # x9801 ; & # x63a5 ; & # x53e3 ;)
	 * @param: @param page &#x7576;&#x524d;&#x7b2c;&#x51e0;&#x9875;
	 * @param: @param size &#x6bcf;&#x9875;&#x663e;&#x793a;&#x51e0;&#x6761;
	 * @param: @return      
	 * @return: Object
	 * @throws
	 */
	@PostMapping("page")
	public Object pageVideo(@RequestParam(value="page",defaultValue="1")int page,
							@RequestParam(value="size",defaultValue="10")int size) {
		PageHelper.startPage(page, size);
		 List<Phone> list = phoneService.findAll();
	        PageInfo<Phone> pageInfo = new PageInfo<>(list);
	        Map<String,Object> data = new HashMap<>();
	        data.put("total_size",pageInfo.getTotal());//总条数
	        data.put("total_page",pageInfo.getPages());//总页数
	        data.put("current_page",page);//当前页
	        data.put("data",pageInfo.getList());//数据

	        return data;
	}


    @ResponseBody
    @RequestMapping(value = "all", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public Object all(HttpServletRequest request,String tclx) {
	    List<Phone> list =  phoneService.findByIds(tclx);
        Map<String,Object> data = new HashMap<>();
        data.put("data",list);//数据
		return data;
	}

	@RequestMapping("findType")
    @ResponseBody
    public Object findType(@RequestParam(value="dhh",required=true) String dhh) {
        Phone phone = new  Phone();
        phone.setDhh(dhh);
        List<Phone> list = phoneService.findType(phone);
        Map<String,Object> data = new HashMap<>();
        data.put("data",list);//数据
        return data;
    }

	@RequestMapping("findType1")
	@ResponseBody
	public Object findType1() {
		Phone phone = new  Phone();

		List<Phone> list = phoneService.findType(phone);
		Map<String,Object> data = new HashMap<>();
		data.put("data",list);//数据
		return data;
	}

    @PostMapping("find")
    @ResponseBody
    public Object find( @RequestParam(value="tclx",required=true) String tclx, @RequestParam(value="dhh",required=true) String dhh) {
        Phone phone = new  Phone();
        phone.setTclx(tclx);
        phone.setDhh(dhh);
        List<Phone> list = phoneService.find(phone);
        Map<String,Object> data = new HashMap<>();
        data.put("data",list);//数据
        return data;
    }
	
}
