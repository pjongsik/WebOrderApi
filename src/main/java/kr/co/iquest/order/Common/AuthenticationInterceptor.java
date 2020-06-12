package kr.co.iquest.order.Common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import kr.co.iquest.order.Entity.User;
import kr.co.iquest.order.Service.AuthenticationService;

@Component
public class AuthenticationInterceptor extends HandlerInterceptorAdapter{
	
	private static Logger log = LoggerFactory.getLogger(Log4J2LoggingSystem.class);
	
	private final AuthenticationService authenticationService;
	
	@Autowired
	public AuthenticationInterceptor(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String token = request.getHeader(HttpHeaders.AUTHORIZATION);
		
		User user = authenticationService.authenticate(token);
		
		request.setAttribute("user", user);
		
		if (user != null) {
			
			HttpSession session = request.getSession();
			session.setAttribute("userLoginId", user.getLoginId());
			session.setAttribute("userBusinessNumber", user.getBusinessNumber());
			request.setAttribute("user", user);
		}
		else {
			
			String url = request.getContextPath() + "/error/login";
			log.info("login fail redirect url : {}", url);
			
			response.sendRedirect(url);

			return false;
		}
		
		return super.preHandle(request, response, handler);
	}
}
