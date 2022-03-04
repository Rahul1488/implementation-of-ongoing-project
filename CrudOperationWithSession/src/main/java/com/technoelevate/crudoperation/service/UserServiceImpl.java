package com.technoelevate.crudoperation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevate.crudoperation.dao.AdminDao;
import com.technoelevate.crudoperation.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	AdminDao dao;

	@Override
	public UserDto addUser(UserDto dto) {
		if(dto!=null) {
			return dao.addUser(dto);
		}
		return null;
	}

}
