package kr.co.iquest.order.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import kr.co.iquest.order.Common.AuthenticationInterceptor;
import kr.co.iquest.order.Common.VendorAuthenticationInterceptor;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
	
	@Autowired
	private AuthenticationInterceptor authenticationInterceptor;
	
	@Autowired
	private VendorAuthenticationInterceptor vendorAuthenticationInterceptor;

	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(authenticationInterceptor)
		.addPathPatterns("/user/*");
		
		registry.addInterceptor(vendorAuthenticationInterceptor)
		.addPathPatterns("/order/*")
		.addPathPatterns("/order/*/*/*");
		
		super.addInterceptors(registry);
	}

}
