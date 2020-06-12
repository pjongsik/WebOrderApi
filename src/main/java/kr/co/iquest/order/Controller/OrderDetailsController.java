package kr.co.iquest.order.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.iquest.order.Common.ResultObjects;
import kr.co.iquest.order.Common.Utility;
import kr.co.iquest.order.Entity.OrderDetails;
import kr.co.iquest.order.Service.OrderDetailsService;

@RestController
@RequestMapping(value = "/orderDetails")
public class OrderDetailsController {
	
	private static Logger log = LoggerFactory.getLogger(Log4J2LoggingSystem.class);
	
	private OrderDetailsService orderDetailsService;
	
	@Autowired
	public OrderDetailsController(OrderDetailsService orderDetailsService ) {
		this.orderDetailsService = orderDetailsService;
	}
	
	@GetMapping("/{orderId}")	
	public ResultObjects<OrderDetails> orderDetails(@PathVariable int orderId) {
		log.info("==> orderId : {}", orderId);
		
		int returnValue = 1000;
		String returnMessage = "성공";
		List<OrderDetails> orderDetails = null; 
		
		try {
			orderDetails = orderDetailsService.findByOrderId(orderId);
		}
		catch (Exception ex) {
			returnValue = 2003;
			returnMessage = ex.getMessage();
		}
		
		
		return Utility.resultObjects(returnValue, returnMessage, orderDetails);
	}
}
