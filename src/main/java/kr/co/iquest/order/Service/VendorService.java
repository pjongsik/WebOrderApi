package kr.co.iquest.order.Service;

import java.util.List;
import java.util.Optional;

import kr.co.iquest.order.Entity.MyOrderCompany;
import kr.co.iquest.order.Entity.OrderCompany;
import kr.co.iquest.order.Entity.User;

public interface VendorService {
	
	MyOrderCompany UpdateApplovalCode(int userId, int orderCompanyId, boolean isApproval);

	OrderCompany save(OrderCompany orderCompany);

	Iterable<OrderCompany> findAll();

	Optional<OrderCompany> findById(Integer id);
}
