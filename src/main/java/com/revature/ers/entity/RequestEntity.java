package com.revature.ers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
@Entity
@Table(name="request_details")
public class RequestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="req_id")
    private int reqId;
    
    @Column(name="user_id ")
    private int userId;
    
    @Column(name="type")
    private int reqType;
    
    @Column(name="request_amount", nullable = false)
    private int reqAmount;

    @Column(name="submit_date ", nullable = false)
    private String submitDate;

    @Column(name="approve_date ")
    private String approveDate;

     @Column(name="manager", nullable = false)
    private Integer manager;

   
 @Column(name="status", nullable = false)
    private int reqStatus;


public int getReqId() {
	return reqId;
}


public void setReqId(int reqId) {
	this.reqId = reqId;
}


public int getUserId() {
	return userId;
}


public void setUserId(int userId) {
	this.userId = userId;
}


public int getReqType() {
	return reqType;
}


public void setReqType(int reqType) {
	this.reqType = reqType;
}


public int getReqAmount() {
	return reqAmount;
}


public void setReqAmount(int reqAmount) {
	this.reqAmount = reqAmount;
}


public String getSubmitDate() {
	return submitDate;
}


public void setSubmitDate(String submitDate) {
	this.submitDate = submitDate;
}


public String getApproveDate() {
	return approveDate;
}


public void setApproveDate(String approveDate) {
	this.approveDate = approveDate;
}


public Integer getManager() {
	return manager;
}


public void setManager(Integer manager) {
	this.manager = manager;
}


public int getReqStatus() {
	return reqStatus;
}


public void setReqStatus(int reqStatus) {
	this.reqStatus = reqStatus;
}

   
}