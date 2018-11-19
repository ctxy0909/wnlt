package com.zmkj.wnlt.service;

import com.zmkj.wnlt.domain.Phone;

import java.util.List;

public interface PhoneService {
	
	
	    List<Phone> findAll( );
	List<Phone> findByIds(String tclx);
	int update(Phone phone);

    List<Phone> findType(Phone phone);
    List<Phone> find(Phone phone);

}
