package kr.co.iquest.order.Entity;

import java.io.Serializable;

public class MyOrderCompanyId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3803309750899383684L;
	
	private int id;
	private int orderCompanyId;
	
	public MyOrderCompanyId() {}
	public MyOrderCompanyId(int id, int orderCompanyId) {
		this.id = id;
		this.orderCompanyId = orderCompanyId;
	}
}
