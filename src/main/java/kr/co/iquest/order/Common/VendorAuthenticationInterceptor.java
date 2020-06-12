package kr.co.iquest.order.Common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import kr.co.iquest.order.Entity.OrderCompany;
import kr.co.iquest.order.Entity.User;
import kr.co.iquest.order.Service.AuthenticationService;

@Component
public class VendorAuthenticationInterceptor extends HandlerInterceptorAdapter{
	
	
	private final AuthenticationService authenticationService;
	
	@Autowired
	public VendorAuthenticationInterceptor(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String token = request.getHeader(HttpHeaders.AUTHORIZATION);
		
		OrderCompany user = authenticationService.vendorAuthenticate(token);
		
		
		return super.preHandle(request, response, handler);
	}
}
