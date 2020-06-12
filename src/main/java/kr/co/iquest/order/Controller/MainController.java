package kr.co.iquest.order.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	private static Logger log = LoggerFactory.getLogger(Log4J2LoggingSystem.class);

	@RequestMapping(value ="/main")
	public ModelAndView main(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
		
		Object keystring = session.getAttribute("keystring");
		
		if (keystring == null) {
			String url = request.getContextPath() + "/login";
			response.sendRedirect(url);
			return null;
		}
		
		String loginId = session.getAttribute("loginId").toString();
		String userId = session.getAttribute("UserId").toString();
		String businessNumber = session.getAttribute("BusinessNumber").toString();
		String companyName = session.getAttribute("CompanyName").toString();
		

		log.info("--loginId : {}", loginId);
		log.info("--userId : {}", userId);
		log.info("--businessNumber : {}", businessNumber);
		log.info("--companyName : {}", companyName);
		log.info("--keystring : {}", keystring);
		
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		
		return mv;
	}
}
