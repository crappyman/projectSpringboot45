package com.revature.ers.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.ers.entity.RequestEntity;
import com.revature.ers.pojo.RequestPojo;


@Repository("reimbursementDao")
@Transactional
public interface RequestDao extends JpaRepository <RequestEntity,Integer>{
	 //List<RequestEntity> findReimbursementByMan(Integer manger);
}
