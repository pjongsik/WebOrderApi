package kr.co.iquest.order.Repository;

import org.springframework.data.repository.CrudRepository;
import kr.co.iquest.order.Entity.OrderCompany;

public interface VendorRepository extends CrudRepository<OrderCompany, Integer> {

	OrderCompany findByLoginIdAndPassword(String loginId, String password);
	
}
