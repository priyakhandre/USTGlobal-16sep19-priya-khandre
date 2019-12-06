package com.ustglobal.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.springboot.dto.EmployeeBean;
import com.ustglobal.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	/*@ResponseBody which directly send logical response from controller to client instead of view 
	 * @controller + @ResponseBody = @RestController*/

	@PostMapping(path = "/add" , consumes = MediaType.APPLICATION_JSON_VALUE ,
			produces = MediaType.APPLICATION_JSON_VALUE)  /*for adding purpose we use postMapping*/
	public /*@ResponseBody*/ EmployeeResponse addEmployee(@RequestBody EmployeeBean bean)
	{ 
		EmployeeResponse response = new EmployeeResponse();

		if(service.addEmployee(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data added to the DB");

		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("data not added to the DB");

		}

		return response;

	}

	@PutMapping(path="/modify" ,consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE) /*for adding and modifying we use put Mapping*/
	public EmployeeResponse modifyEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();

		if(service.modifyEmployee(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data modified to the DB");

		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("data not modified to the DB");

		}

		return response;


	}

	@DeleteMapping(path="/delete/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE ) /*for deleting we pass int id so here we pass path variable*/
	public EmployeeResponse deleteEmployee(@PathVariable("id")int id){
		EmployeeResponse response = new EmployeeResponse();

		if(service.deleteEmployee(id)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data deleted to the DB");

		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("data not deleted to the DB");

		}

		return response;

	}

	@GetMapping (path="/get" , produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id") int id) { /*for getting query string to get all the employee data we use @RequestParam*/
		EmployeeResponse response = new EmployeeResponse();
		EmployeeBean bean = service.getEmployee(id);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data found in the DB");
			response.setEmployeebean(Arrays.asList(bean));


		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("data not found in the DB");


		}
		return response;
	}

	@GetMapping(path ="/get-all" ,produces= MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(){
		EmployeeResponse response = new EmployeeResponse();
		List<EmployeeBean> beans = service.getAllEmployee();
		if(!beans.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data found in the DB");
			response.setEmployeebean(beans);


		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("data not found in the DB");
		}
		return response;
		}
	
	@GetMapping(path="/exec" , produces= MediaType.APPLICATION_JSON_VALUE)
	public void createException() {
		int i = 1/0;
		
	}





}
