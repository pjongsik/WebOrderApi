package kr.co.iquest.order.Entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "orderid")
	public int orderId;
	
	@Column(name = "ordernumber")
	public String orderNumber;
	
	@Column(name = "ordercompanyid")
	public int orderCompanyId;
	
	@Column(name = "id")
	public int id;
	
	@Column(name = "ordername")
	public String orderName;
	
	@Column(name = "remark")
	public String remark;
	
	@Column(name = "totalprice")
	public BigDecimal totalPrice;
	
	@Column(name = "orderdate")
	public Date orderDate;
	
	@Column(name = "ordermodifydate")
	public Date OrderModifyDate;
	
	@Column(name = "receiveddate")
	public Date receivedDate;
	
	@Column(name = "statecode")
	public int stateCode;
	
	@Column(name = "registeredon")
	public Date registeredOn;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getOrderCompanyId() {
		return orderCompanyId;
	}

	public void setOrderCompanyId(int orderCompanyId) {
		this.orderCompanyId = orderCompanyId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getOrderModifyDate() {
		return OrderModifyDate;
	}

	public void setOrderModifyDate(Date orderModifyDate) {
		OrderModifyDate = orderModifyDate;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	public Date getRegisteredOn() {
		return registeredOn;
	}

	public void setRegisteredOn(Date registeredOn) {
		this.registeredOn = registeredOn;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderNumber=" + orderNumber + ", orderCompanyId=" + orderCompanyId
				+ ", id=" + id + ", orderName=" + orderName + ", remark=" + remark + ", totalPrice=" + totalPrice
				+ ", orderDate=" + orderDate + ", OrderModifyDate=" + OrderModifyDate + ", receivedDate=" + receivedDate
				+ ", stateCode=" + stateCode + ", registeredOn=" + registeredOn + "]";
	}
}
