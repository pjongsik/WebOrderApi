package kr.co.iquest.order.Service;

import java.util.Date;
import java.util.List;

import kr.co.iquest.order.Entity.Orders;

public interface OrdersService {
	List<Orders> findByOrderCompanyId(int orderCompanyId);

	List<Orders> findByOrderCompanyIdAndOrderDateBetween(int orderCompanyId, Date startOrderDate, Date endOrderDate);

}
