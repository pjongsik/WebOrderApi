package kr.co.iquest.order.Service;

import java.util.List;

import kr.co.iquest.order.Entity.OrderDetails;

public interface OrderDetailsService {
	public List<OrderDetails> findByOrderId(int orderId);
	
}
