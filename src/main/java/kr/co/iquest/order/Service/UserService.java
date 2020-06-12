package kr.co.iquest.order.Service;

import java.util.List;
import java.util.Optional;

import kr.co.iquest.order.Entity.User;

public interface UserService {
	
	User join(User user);
	
	User update(User user);

	List<User> findByOrderCompanyId(Integer ordercompanyid);
	
	Optional<User> findById(Integer id);
	
	boolean existsLoginId(String loginid);
	
	boolean existsBusinessNumber(String businessnumber);
	
	User login(String loginId, String password);
}
