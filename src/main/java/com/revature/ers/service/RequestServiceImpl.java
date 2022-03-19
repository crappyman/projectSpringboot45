package com.revature.ers.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ers.dao.RequestDao;
import com.revature.ers.entity.RequestEntity;
import com.revature.ers.pojo.RequestPojo;

@Service

public class RequestServiceImpl implements RequestService {
	@Autowired
	RequestDao requestDao;
	
	public RequestServiceImpl() {
	//	requestDao = new RequestDaoImpl();
	}

	@Override
	public List<RequestPojo> viewAllRequest() {
		
			List<RequestPojo> allRequestPojo = new ArrayList<RequestPojo>();
			List<RequestEntity> allRequestEntity = requestDao.findAll();
			for(RequestEntity requsetEntity: allRequestEntity) {
				//RequestPojo requsetPojo = new RequestPojo(requsetEntity), requsetEntity.getBookTitle(), requsetEntity.getBookAuthor(), requsetEntity.getBookGenre(), requsetEntity.getBookCost(), requsetEntity.getBookImageUrl());
				//allRequestPojo.add(requsetPojo);
			}
			return allRequestPojo;
	}

	@Override
	public RequestPojo addRequest(RequestPojo requestPojo) {
		RequestEntity requsetEntity = null;//new RequestEntity(requestPojo.getBookId(), requestPojo.getBookTitle(), requestPojo.getBookAuthor(), requestPojo.getBookGenre(), requestPojo.getBookCost(), requestPojo.getBookImageUrl());
		requestDao.saveAndFlush(requsetEntity);
		//requestPojo = new RequestPojo(requsetEntity.getBookId(), requsetEntity.getBookTitle(), requsetEntity.getBookAuthor(), requsetEntity.getBookGenre(), requsetEntity.getBookCost(), requsetEntity.getBookImageUrl());
			return requestPojo;
	}

	@Override
	public List<RequestPojo> viewPendingRequest() {
		//return requestDao.viewPendingRequest();
		return null;
	}

	@Override
	public RequestPojo reviewRequest(int reqId, int status) {
		//return requestDao.reviewRequest(reqId, status);
		return null;
	}

	@Override
	public RequestPojo deleteRequest(int reqId) {
		requestDao.deleteById(reqId);
		return null;
	}

	@Override
	public RequestPojo fetchARequest(int reqId) {
/*		Optional<RequestEntity> optional = requestDao.findById(reqId);
		RequestPojo requestPojo = null;
		if(optional.isPresent()) {
			RequestEntity requestEntity = optional.get();
			RequestPojo = new RequestPojo(requestEntity.getBookId(), requestEntity.getBookTitle(), requestEntity.getBookAuthor(), requestEntity.getBookGenre(), requestEntity.getBookCost(), requestEntity.getBookImageUrl());	
		}*/
		return null;
	}
	}

