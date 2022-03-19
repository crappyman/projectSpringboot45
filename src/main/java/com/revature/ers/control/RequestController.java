package com.revature.ers.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ers.pojo.RequestPojo;
import com.revature.ers.service.RequestService;
//import com.revature.ers.service.RequestServiceImpl;
@RestController
@RequestMapping("api/request")
public class RequestController {
	
	public RequestController() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	RequestService requestService;
	//http://localhost:1010/api/allRequests
	@GetMapping("allRequests")
	 List<RequestPojo> viewAllRequest(){
	return requestService.viewAllRequest();
	}
	//http://localhost:1010/api/requests
		@PostMapping("addRequest")
		RequestPojo addRequest(@RequestBody RequestPojo requestPojo) {
			return requestService.addRequest(requestPojo);
		}
		//http://localhost:1010/api/requests
		//view pending request
		@GetMapping("pendingRequests")
		List<RequestPojo> viewPendingRequest(){
			return requestService.viewPendingRequest();
		}
		@GetMapping("requestsByStatus")
		List<RequestPojo> getRequestByStatus(@RequestParam("status") int status ){
			return requestService.viewRequestsByStatus(status);
		}
		//manage to review and either approve, denied the request
		//http://localhost:1010/api/requests/{reqId}/{status}
		@PutMapping("modifyRequestStatus/{reqId}/{status}")
		RequestPojo reviewRequest(@PathVariable int reqId, @PathVariable int status) {
			
			return requestService.reviewRequest(reqId, status);
		}
		//http://localhost:1010/api/requests/1
		@GetMapping("fetchRequests/{reqId}")
		RequestPojo fetchARequest(@PathVariable ("reqId") int reqId) {
			return requestService.fetchARequest(reqId);
		}
		//http://localhost:1010/api/requests/2
		@DeleteMapping("deleteRequest/{reqId}")
		List<RequestPojo> deleteRequest(@PathVariable ("reqId") int reqId) {
			return requestService.deleteRequest(reqId);
		}
}
