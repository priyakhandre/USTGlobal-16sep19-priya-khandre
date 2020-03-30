package com.ust.librarysystem.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.librarysystem.dto.BookBean;
import com.ust.librarysystem.dto.BookIssue;
import com.ust.librarysystem.dto.LibraryResponse;
import com.ust.librarysystem.dto.LibrerianBean;
import com.ust.librarysystem.dto.StudentBean;
import com.ust.librarysystem.service.LibraryService;
@CrossOrigin(origins = "*", allowedHeaders = "*" , allowCredentials = "true")
@RestController
public class LibraryController {
	@Autowired
	private LibraryService service;
	@Autowired
	private LibraryResponse resp;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		CustomDateEditor editor = new CustomDateEditor(format,true);
		binder.registerCustomEditor(Date.class, editor);

	}

	@PostMapping(path="/loginstud",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse loginstud(@RequestParam("id")String id,@RequestParam("password")String password) {
		StudentBean bean = service.loginStudent(id,password);
		if(bean!=null) {
			//			xHttpSession session = req.getSession();
			//			session.setAttribute("studentbean", bean);
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Student Login");
			resp.setSession("session created");
			resp.setStud(Arrays.asList(bean));
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Student not login");
			resp.setSession("session not created");
			resp.setStud(null);
		}
		return resp;
	}

	@PostMapping(path="/loginlib",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse loginlib(@RequestParam("id")String id,@RequestParam("password")String password) {
		LibrerianBean bean = service.loginLibrerian(id,password);
		if(bean!=null) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Student Login");
			resp.setSession("session created");
			resp.setLib(Arrays.asList(bean));
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Student not login");
			resp.setSession("session not created");
			resp.setStud(null);
		}
		return resp;
	}

	@PostMapping(path="/registerstud",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse registerStudent(@RequestBody StudentBean bean) {
		if(service.registerStudent(bean)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Student Register");
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Student not register");
		}
		return resp;
	}

	@PostMapping(path="/registerlib",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse registerLib(@RequestBody LibrerianBean bean) {
		if(service.registerLibrerian(bean)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Librerian Register");
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Librerian not register");
		}
		return resp;
	}

	@PostMapping(path="/addbook",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse addBook(@RequestBody BookBean bean) {
		if(service.addBook(bean)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("New Book Added");
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Can't add this book");
		}
		return resp;
	}

	@GetMapping(path="/searchbook",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse searchBook(@RequestParam("id")int id) {
		BookBean bean = service.searchBook(id);
		if(bean!=null) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book available");
			resp.setBook(bean);
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Book not available");
		}
		return resp;
	}

	@PutMapping(path="/updatebook",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse updateBook(@RequestParam("id")int id,@RequestParam("bname")String bname,
			@RequestParam("bauthor")String bauthor,@RequestParam("publication")String publication) {
		if(service.updatebook(id,bname,bauthor,publication)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book information update");
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Book information not update");
		}
		return resp;
	}

	@DeleteMapping(path="/delete",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteBook(@RequestParam("id")int id) {
		if(service.deletebook(id)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book information deleted");
		} else {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book not found");
		}
		return resp;
	}

	@PostMapping(path="/request", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse requestBook(@RequestParam("sid")String sid,@RequestParam("id")int id) {
		if(service.request(sid, id)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book requested");
		} else {
			resp.setStatusCode(201);
			resp.setMessage("failure");
			resp.setDescription("Book not available");
		}
		return resp;
	}
	
	@PostMapping(path="/respond",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse respondBook(@RequestParam("id")int id) {
		if(service.respond(id)){
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book request accepted");
		}else {
			resp.setStatusCode(201);
			resp.setMessage("failure");
			resp.setDescription("Book request not accepted");
		}
		return resp;		
	}
	
	@DeleteMapping(path="/deleterespond", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteRespond(@RequestParam("id")int id) {
		if(service.deleteRespond(id)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book Request Rejected");
		}else {
			resp.setStatusCode(201);
			resp.setMessage("failure");
			resp.setDescription("Book request pending");
		}
		return resp;
	}
	
	@GetMapping(path="/bookissue",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getresponse() {
		List<BookIssue> book = service.getResponse();
		if(book!=null){
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("All Book Issue Request");
			resp.setIssue(book);
		}else {
			resp.setStatusCode(201);
			resp.setMessage("failure");
			resp.setDescription("Book request not accepted");
		}
		return resp;		
	}
	
}