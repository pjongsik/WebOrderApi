package kr.co.iquest.order.Service;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import com.mysql.jdbc.log.Log;

import kr.co.iquest.order.Entity.MyOrderCompany;
import kr.co.iquest.order.Entity.User;
import kr.co.iquest.order.Exception.AlreadyExistsException;
import kr.co.iquest.order.Repository.MyOrderCompanyRepository;
import kr.co.iquest.order.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private static Logger log = LoggerFactory.getLogger(Log4J2LoggingSystem.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private MyOrderCompanyRepository myOrderCompanyRepository;
	
	
	@Override
	public User join(User user) {
		
		boolean existsLoginId = existsLoginId(user.getLoginId());
		if (existsLoginId) {
			throw new AlreadyExistsException("이미 가입된 아이디입니다.");
		}
		
		boolean existsBusinessNumber = existsBusinessNumber(user.getBusinessNumber());
		if (existsBusinessNumber) {
			throw new AlreadyExistsException("이미 가입된 사업자번호입니다.");
		}
		
		String password = user.getPassword();
		
		// 비밀번호 암호화 TODO
		//
		
		User newUser = userRepository.save(user);
		return newUser;
	}

	@Override
	public User update(User user) {
		return userRepository.save(user);
	}

	@Override
	public Optional<User> findById(Integer id) {
		return userRepository.findById(id);
	}

	@Override
	public boolean existsLoginId(String loginid) {
		User user = userRepository.findByLoginId(loginid);
		return user != null;
	}

	@Override
	public boolean existsBusinessNumber(String businessnumber) {
		User user = userRepository.findByBusinessNumber(businessnumber);
		return user != null;
	}

	@Override
	public User login(String loginId, String password) {
		return userRepository.findByLoginIdAndPassword(loginId, password);
	}

	/**
	 * 대리점 목록 가져오기
	 */
	@Override
	public List<User> findByOrderCompanyId(Integer ordercompanyid) {
		List<MyOrderCompany> list = myOrderCompanyRepository.findByOrderCompanyId(ordercompanyid);
		
		log.info(" list.count : {}", list.size());
		int ids[] = new int[list.size()];
		
		int count = 0;
		for (MyOrderCompany myOrderCompany : list) {
			ids[count++] = myOrderCompany.id;
			log.info("myOrderCompany.id : {}", myOrderCompany.id);
		}
		
		log.info("ids.count : {}", ids.length);
		
		
		return (List<User>) userRepository.findAllById(()->Arrays.stream(ids).iterator());
	}

}
