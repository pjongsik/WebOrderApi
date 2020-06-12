package kr.co.iquest.order.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import kr.co.iquest.order.Entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	public User findByLoginIdAndPassword(String loginid, String password);

	public User findByLoginId(String loginid);

	public User findByBusinessNumber(String businessnumber);
	
}
