package com.technoelevate.crudoperation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.technoelevate.crudoperation.dto.AdminDto;
import com.technoelevate.crudoperation.dto.UserDto;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Override
	public AdminDto login(AdminDto dto) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("team");
		EntityManager manager = factory.createEntityManager();
		try {
			AdminDto find = manager.find(AdminDto.class, dto.getName());
			if (find != null) {
				if (find.getPassword().equalsIgnoreCase(dto.getPassword()) && find.getName().equals(dto.getName())) {
					return find;
				}
			} else {
				return null;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
			manager.close();
		}

		return null;
	}

	@Override
	public UserDto addUser(UserDto dto) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("team");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();

			dto.setUserId(dto.getUserId());
			dto.setUserName(dto.getUserName());
			dto.setAge(dto.getAge());
			dto.setAdd(dto.getAdd());
			dto.setPh_no(dto.getPh_no());
			manager.persist(dto);
			transaction.commit();
			return dto;
		} catch (Exception e) {
			//transaction.rollback();
			e.printStackTrace();
		} finally {
			manager.close();
			factory.close();
		}

		return null;
	}

}
