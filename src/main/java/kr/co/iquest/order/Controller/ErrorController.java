package kr.co.iquest.order.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import kr.co.iquest.order.Common.ResultObjects;
import kr.co.iquest.order.Common.Utility;
import kr.co.iquest.order.Entity.User;

@RestController
@RequestMapping(value = "/error")
public class ErrorController {
	
	private static Logger log = LoggerFactory.getLogger(Log4J2LoggingSystem.class);
	
	@GetMapping(value="/login")
	public ResultObjects<User> get() {
		return Utility.resultObjects(2001, "로그인 인증 실패!!", null);
	}
}
