package com.technoelevate.crudoperation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevate.crudoperation.dao.AdminDao;
import com.technoelevate.crudoperation.dto.AdminDto;
@Service
public class AdminserviceImpl implements AdminService {
	
	@Autowired
	AdminDao adminDao;
	@Override
	public AdminDto login(AdminDto dto) {
		if(dto.getName()!=null ) {
			return adminDao.login(dto);
		}
		return null;
	}

}
