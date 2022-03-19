package com.revature.ers.service;

import java.util.List;

import com.revature.ers.pojo.RequestPojo;



public interface RequestService {
	//view all request doesnt matter of the status
	List<RequestPojo> viewAllRequest();
	
	RequestPojo addRequest(RequestPojo requestPojo);
	
	//view pending request
	List<RequestPojo> viewPendingRequest();
	
	//manage to review and either approve, denied the request
	RequestPojo reviewRequest(int reqId, int status);
	
	RequestPojo fetchARequest(int reqId);
	
	RequestPojo deleteRequest(int reqId);
}
