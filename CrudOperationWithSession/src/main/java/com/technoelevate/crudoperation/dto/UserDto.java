package com.technoelevate.crudoperation.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class UserDto {
	@Id
	private int userId;
	private String userName;
	private int age;
	private String ph_no;
	private String add;
}
