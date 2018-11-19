package com.zmkj.wnlt.service.impl;

import com.zmkj.wnlt.domain.Phone;
import com.zmkj.wnlt.mapper.PhoneMapper;
import com.zmkj.wnlt.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {
	@Autowired
	private PhoneMapper phoneMapper;
    /*
    * 查找所有
    * */
	@Override
	public List<Phone> findAll() {
		return phoneMapper.findAll( );
	}

    /***
     *
     * @param tclx
     * @return
     */
	@Override
	public List<Phone> findByIds(String tclx) {
		return phoneMapper.findByIds(tclx);
	}


    /**
     * 确认是否选购
     * @param phone
     * @return
     */
	@Override
	public int update(Phone phone) {
		return phoneMapper.update(phone);
	}

	/*
	* 按类型查找
	* */
    @Override
    public List<Phone> findType(Phone phone) {
        return phoneMapper.findType(phone);
    }

    /***
     *按类型查找
     * @param
     * @param
     * @return
     */
    @Override
    public List<Phone> find(Phone phone) {
        return phoneMapper.find(phone );
    }
}
