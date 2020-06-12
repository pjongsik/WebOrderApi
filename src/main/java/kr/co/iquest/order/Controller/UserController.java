package kr.co.iquest.order.Controller;

import java.awt.PageAttributes.MediaType;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.iquest.order.Common.ResultObjects;
import kr.co.iquest.order.Common.Utility;
import kr.co.iquest.order.Entity.User;
import kr.co.iquest.order.Exception.AlreadyExistsException;
import kr.co.iquest.order.Repository.UserRepository;
import kr.co.iquest.order.Service.UserService;

import org.slf4j.Logger;


@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	private static Logger log = LoggerFactory.getLogger(Log4J2LoggingSystem.class);
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	/**
	 * 아이디 중복 확인 
	 * 192.168.1.43:8080/user/loginId/duplication/test1
	 * @param loginid
	 * @return
	 */
	@GetMapping(value = "/loginId/duplication/{loginid}")
	public @ResponseBody ResultObjects<User> existsLoginId(@PathVariable String loginid) {
		
		log.info("==> LoginId : {}", loginid);
		
		int returnValue = 1000;
		String returnMessage = "성공";
		
		try {
			boolean existsLoginId = userService.existsLoginId(loginid);
			
			log.info("==> existsLoginId : {}", existsLoginId);
			
			
			if (existsLoginId) {
				returnValue = 2000;
				returnMessage = "이미 존재하는 아이디입니다.";
			}
		}
		catch (Exception ex) {
			returnValue = 2003;
			returnMessage = ex.getMessage();
		}
		
		
		return Utility.resultObjects(returnValue, returnMessage, null);
	}
	
	/**
	 * 사업자번호 중복 확인 
	 * 192.168.1.43:8080/user/businessNumber/duplication/456-34-23652
	 * @param businessnumber
	 * @return
	 */
	@GetMapping(value = "/businessNumber/duplication/{businessnumber}")
	public @ResponseBody ResultObjects<User> existsBusinessNumber(@PathVariable String businessnumber) {
		
		log.info("==> businessnumber : {}", businessnumber);
		
		int returnValue = 1000;
		String returnMessage = "성공";
		
		try {
			boolean existsBusinessNumber = userService.existsBusinessNumber(businessnumber);
			
			log.info("==> existsBusinessNumber : {}", existsBusinessNumber);
			
			
			if (existsBusinessNumber) {
				returnValue = 2000;
				returnMessage = "이미 존재하는 사업자번호입니다.";
			}
		}
		catch (Exception ex) {
			returnValue = 2003;
			returnMessage = ex.getMessage();
		}
		
		
		return Utility.resultObjects(returnValue, returnMessage, null);
	}
	
	
	@PutMapping
	public @ResponseBody ResultObjects<User> put(@RequestBody User user) {
		
		log.info("==> user : {}", user.toString());
		
		int returnValue = 1000;
		String returnMessage = "성공";
		
		try {
			User newUser = userService.join(user);
		}
		catch (Exception ex) {
			returnValue = 2001;
			returnMessage = ex.getMessage();
		}
		
		return Utility.resultObjects(returnValue, returnMessage, null);
	}
	
	/**
	 * http://192.168.1.43:8080/user/orderCompanyId/1
	 * @param orderCompanyId
	 * @return
	 */
	@GetMapping(value ="/orderCompanyId/{orderCompanyId}")
	public ResultObjects<User> list(@PathVariable Integer orderCompanyId) {
		log.info("list ==> orderCompanyId : {}", orderCompanyId);
		int returnValue = 1000;
		String returnMessage = "성공";
		List<User> userList = null;
		
		try {
			userList = userService.findByOrderCompanyId(orderCompanyId);
		}
		catch (Exception ex) {
			returnValue = 2001;
			returnMessage = ex.getMessage();
		}
		
		return Utility.resultObjects(returnValue, returnMessage, userList);
	}
	
	/**
	 * http://192.168.1.43:8080/user/1
	 * @param id
	 * @return
	 */
	@GetMapping(value ="/{id}")
	public Optional<User> findOne(@PathVariable Integer id) {
		
		//HttpSession session = request.getSession();
		
		log.info("==> id : {}", id);
		return userService.findById(id);
	}
	
	@PutMapping(value ="/{id}")
	public Optional<User> update(@PathVariable Integer id, @RequestParam String companyName) {
		Optional<User> user = userService.findById(id);
		
		if (user != null) {
			user.get().setCompanyName(companyName);
			userService.update(user.get());
		}
		
		return user;
	}
	

}
