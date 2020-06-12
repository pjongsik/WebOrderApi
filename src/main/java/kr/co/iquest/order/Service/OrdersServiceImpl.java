package kr.co.iquest.order.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.iquest.order.Entity.Orders;
import kr.co.iquest.order.Repository.OrdersRepository;


@Service
public class OrdersServiceImpl implements OrdersService {

	private OrdersRepository ordersRepository;
	
	@Autowired
	public OrdersServiceImpl(OrdersRepository ordersRepository) {
		this.ordersRepository = ordersRepository;
	}
	

	@Override
	public List<Orders> findByOrderCompanyId(int orderCompanyId) {
		
		return ordersRepository.findByOrderCompanyId(orderCompanyId);
	}


	@Override
	public List<Orders> findByOrderCompanyIdAndOrderDateBetween(int orderCompanyId, Date startOrderDate,
			Date endOrderDate) {
		
		return ordersRepository.findByOrderCompanyIdAndOrderDateBetween(orderCompanyId, startOrderDate, endOrderDate);
	}
}
