package kr.co.iquest.order.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import kr.co.iquest.order.Entity.OrderCompany;
import kr.co.iquest.order.Entity.User;
import kr.co.iquest.order.Repository.UserRepository;
import kr.co.iquest.order.Repository.VendorRepository;

@Service
public class AuthentisationServiceImpl implements AuthenticationService {

	private static Logger log = LoggerFactory.getLogger(Log4J2LoggingSystem.class);
	
	private final UserRepository userRepository;
	private final VendorRepository vendorRepository;
	
	@Autowired
	public AuthentisationServiceImpl(UserRepository userRepository, VendorRepository vendorRepository) {
		this.userRepository = userRepository;
		this.vendorRepository = vendorRepository;
	}
	
	@Override
	public User authenticate(String token) {
		
		log.info("==> authenticate - token : {}", token);
		
		if (token == null) 
			return null;
		
		String[] split = token.split(" ");
		String type = split[0];
		String credential = split[1];
		
		User user = null;
		if ("Basic".equalsIgnoreCase(type)) {
			String decoded = new String(Base64Utils.decodeFromString(credential));
			String[] loginidAndPassword = decoded.split(":");
			user = userRepository.findByLoginIdAndPassword(loginidAndPassword[0], loginidAndPassword[1]);
		}
		
		log.info("==> user : {}", user.toString());
		
		return user;
	}

	@Override
	public OrderCompany vendorAuthenticate(String token) {
		log.info("==> vendorAuthenticate - token : {}", token);
		
		if (token == null)
			return null;
		
		String[] split = token.split(" ");
		String type = split[0];
		String credential = split[1];
		
		OrderCompany user = null;
		if ("Basic".equalsIgnoreCase(type)) {
			String decoded = new String(Base64Utils.decodeFromString(credential));
			String[] loginidAndPassword = decoded.split(":");
			user = vendorRepository.findByLoginIdAndPassword(loginidAndPassword[0], loginidAndPassword[1]);
		}
		
		log.info("==> OrderCompany : {}", user.toString());
		
		return user;
	}
	
}
