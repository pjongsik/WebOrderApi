package kr.co.iquest.order.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.co.iquest.order.Entity.Orders;


public interface OrdersRepository extends CrudRepository<Orders, Integer> {

	List<Orders> findByOrderCompanyId(int orderCompanyId);

	List<Orders> findByOrderCompanyIdAndOrderDateBetween(int orderCompanyId, Date startOrderDate, Date endOrderDate);

	
}
