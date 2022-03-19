package com.revature.ers.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.revature.ers.entity.UsersEntity;


@Repository("userDao")
@Transactional
public interface UserDao extends JpaRepository <UsersEntity,Integer> {

	//@Query("from UsersEntity where userName = :username")
    UsersEntity findByUserName(String username);

}
