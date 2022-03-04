package com.technoelevate.crudoperation.dao;

import com.technoelevate.crudoperation.dto.AdminDto;
import com.technoelevate.crudoperation.dto.UserDto;

public interface AdminDao {

	AdminDto login(AdminDto dto);

	UserDto addUser(UserDto dto);

}
