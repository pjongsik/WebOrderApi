package kr.co.iquest.order.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.co.iquest.order.Entity.OrderDetails;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Integer> {
	List<OrderDetails> findByOrderId(int orderId);
}
