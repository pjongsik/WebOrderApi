package kr.co.iquest.order.Controller;

import java.util.Date;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

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
import kr.co.iquest.order.Entity.OrderCompany;
import kr.co.iquest.order.Entity.Orders;
import kr.co.iquest.order.Service.OrdersService;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

	private static Logger log = LoggerFactory.getLogger(Log4J2LoggingSystem.class);
	
	private OrdersService ordersService;
	
	@Autowired
	public OrderController(OrdersService ordersService) {
		this.ordersService = ordersService;
	}
	
	/**
	 * http://192.168.1.43:8080/order/1/20200101/20200101
	 * @param orderCompanyId
	 * @param startOrderDate
	 * @param endOrderDate
	 * @return
	 */
	@GetMapping("/{orderCompanyId}/{startOrderDate}/{endOrderDate}")	
	public ResultObjects<Orders> list(@PathVariable int orderCompanyId, @PathVariable String startOrderDate, @PathVariable String endOrderDate) {
		log.info("==> orderCompanyId : {}", orderCompanyId);
		log.info("==> startOrderDate : {}", startOrderDate);
		log.info("==> endOrderDate : {}", endOrderDate);
		//OrderCompany user = (OrderCompany) request.getAttribute("vendor");
		
		int returnValue = 1000;
		String returnMessage = "성공";
		List<Orders> orderList = null; 
		
		try {
			Date startDate = (Date) Utility.ConvertToDate(startOrderDate);
			Date endDate = (Date) Utility.ConvertToDate(endOrderDate);
			orderList = ordersService.findByOrderCompanyIdAndOrderDateBetween(orderCompanyId, startDate, endDate);
			
		}
		catch (Exception ex) {
			returnValue = 2003;
			returnMessage = ex.getMessage();
		}
		
		
		return Utility.resultObjects(returnValue, returnMessage, orderList);
	}
} 
