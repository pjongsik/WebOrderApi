package kr.co.iquest.order.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JoinController {

	@RequestMapping(value ="/join")
	public ModelAndView join() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("join");
		
		return mv;
	}
}
