package kr.co.iquest.order.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.iquest.order.Entity.OrderDetails;
import kr.co.iquest.order.Repository.OrderDetailsRepository;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

	private OrderDetailsRepository orderDetailsRepository;
	
	@Autowired
	public OrderDetailsServiceImpl(OrderDetailsRepository orderDetailsRepository) {
		this.orderDetailsRepository = orderDetailsRepository;
	}

	@Override
	public List<OrderDetails> findByOrderId(int orderId) {
		return orderDetailsRepository.findByOrderId(orderId);
	}
	

}

