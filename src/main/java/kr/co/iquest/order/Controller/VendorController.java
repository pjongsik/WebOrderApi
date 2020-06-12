package kr.co.iquest.order.Controller;

import java.awt.PageAttributes.MediaType;
import java.util.Date;
import java.util.Optional;

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

import com.fasterxml.jackson.core.JsonParser;

import kr.co.iquest.order.Common.ResultObjects;
import kr.co.iquest.order.Common.Utility;
import kr.co.iquest.order.Entity.OrderCompany;
import kr.co.iquest.order.Repository.VendorRepository;
import kr.co.iquest.order.Service.VendorService;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;


@RestController
@RequestMapping(value = "/vendor")
public class VendorController {
	
	private static Logger log = LoggerFactory.getLogger(Log4J2LoggingSystem.class);
	
	private VendorService vendorService;
	
	@Autowired
	public VendorController(VendorService vendorService) {
		this.vendorService = vendorService;
	}
	
	@PutMapping
	public @ResponseBody ResultObjects<OrderCompany> put(@RequestBody OrderCompany orderCompany) {
		
		log.info("==> orderCompany : {}", orderCompany.toString());
		
		int returnValue = 1000;
		String returnMessage = "성공";
		
		try {
		
			OrderCompany newVendor =  vendorService.save(orderCompany);
		}
		catch (Exception ex) {
			returnValue = 2001;
			returnMessage = ex.getMessage();
		}
		
		return Utility.resultObjects(returnValue, returnMessage, null);
	}
	
	@GetMapping
	public Iterable<OrderCompany> list() {
		return vendorService.findAll();
	}
	
	@GetMapping(value ="/{id}")
	public Optional<OrderCompany> findOne(@PathVariable Integer id) {
		log.info("==> id : {}", id);
		return vendorService.findById(id);
	}
	
	@PutMapping(value ="/{id}")
	public Optional<OrderCompany> update(@PathVariable Integer id, @RequestParam String companyName) {
		OrderCompany orderCompany = vendorService.findById(id).get();
		orderCompany.setCompanyName(companyName);
		vendorService.save(orderCompany);
		
		return null;
	}
	
	@GetMapping(value ="/approval")
	public ResultObjects<OrderCompany> approval(@RequestBody String params) {
		log.info("==> params : {}", params);
		
		int returnValue = 1000;
		String returnMessage = "성공";
		
		try {
			 JSONParser jsonParser = new JSONParser();
             JSONObject jsonObject = (JSONObject) jsonParser.parse(params);
             
            int userId = Integer.parseInt(jsonObject.get("UserId").toString());
			int orderCompanyId = Integer.parseInt(jsonObject.get("OrderCompanyID").toString());
			boolean isApproval = "True".equals(jsonObject.get("IsApproval"));
			
			log.info("==> userId : {}", userId);
			log.info("==> orderCompanyId : {}", orderCompanyId);
			log.info("==> isApproval : {}", isApproval);
			
			// 승인여부 업데이트
			vendorService.UpdateApplovalCode(userId, orderCompanyId, isApproval);
			
		}
		catch (Exception ex) {
			returnValue = 2001;
			returnMessage = ex.getMessage();
		}
		
		return Utility.resultObjects(returnValue, returnMessage, null);
	}
	
	
}
