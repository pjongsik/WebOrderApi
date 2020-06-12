package kr.co.iquest.order.Controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.validator.internal.util.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.springframework.stereotype.Controller;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.iquest.order.Entity.User;
import kr.co.iquest.order.Service.UserService;

@Controller
public class LoginController {

	private static Logger log = LoggerFactory.getLogger(Log4J2LoggingSystem.class);

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
		
		Object keystring = session.getAttribute("keystring");
		if (keystring != null) {
			String url = request.getContextPath() + "/main";
			
			response.sendRedirect(url);
			return null;
		}
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		
		return mv;
	}
	
	
	@RequestMapping(value = "/loginProcess")
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
		
		String id = request.getParameter("username");
		String pwd = request.getParameter("password");
		String returnUrl = request.getParameter("returnUrl");
		String viewName = "main";
		String errorMessage = "";
		
		log.info("id : {}",id);
		log.info("pwd : {}",pwd);
		log.info("returnUrl : {}",returnUrl);
		
		// 유효성 확인
		if (("").equals(id) || ("").equals(pwd)) {
			errorMessage = "잘못된 아이디/패스워드 입니다. 로그인하지 못했습니다.";
			viewName = "login";
			return null;
		}
		
		User loginUser = userService.login(id, pwd);
		
		ModelAndView mv = new ModelAndView();
		
		if (loginUser == null) {
			errorMessage = "잘못된 아이디/패스워드 입니다. 로그인하지 못했습니다.";
			viewName = "login";
		}
		else {
			
			log.info("BusinessNumber : {}",loginUser.getBusinessNumber());
			log.info("CompanyName : {}",loginUser.getCompanyName());
			
			// base64
			String keystring = Base64Utils.encodeToString(id.getBytes());
			log.info("keystring : {}",keystring);
			
			// session
			session.setAttribute("loginId", id);
			session.setAttribute("UserId", loginUser.getId());
			session.setAttribute("BusinessNumber", loginUser.getBusinessNumber());
			session.setAttribute("CompanyName", loginUser.getCompanyName());
			session.setAttribute("keystring", keystring);
			
			String url = request.getContextPath() + "/main";
			
			response.sendRedirect(url);
			return null;
		}
		
		log.info("viewName : {}",viewName);
		log.info("errorMessage : {}",errorMessage);
		
		mv.setViewName(viewName);
		mv.addObject("message", errorMessage);
		
		return mv;
	}
	

}


