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
@Table(name = "orderdetails")
public class OrderDetails {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "orderdetailid")
	public int orderDetailId;
	
	@Column(name = "orderid")
	public int orderId;
	
	@Column(name = "itemid")
	public int itemId;
	
	@Column(name = "itemname")
	public String itemName;
	
	@Column(name = "itemcode")
	public String itemCode;
	
	@Column(name = "unit")
	public String unit;
	
	@Column(name = "spec")
	public String spec;
	
	@Column(name = "unitprice")
	public BigDecimal unitPrice;
	
	@Column(name = "quantity")
	public BigDecimal quantity;
	
	@Column(name = "receivedquantity")
	public BigDecimal receivedQuantity;
	  
	@Column(name = "remark")
	public String remark;
	
	@Column(name = "modifiedon")
	public Date modifiedOn;
	
	@Column(name = "registeredon")
	public Date registeredOn;

	public int getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getReceivedQuantity() {
		return receivedQuantity;
	}

	public void setReceivedQuantity(BigDecimal receivedQuantity) {
		this.receivedQuantity = receivedQuantity;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public Date getRegisteredOn() {
		return registeredOn;
	}

	public void setRegisteredOn(Date registeredOn) {
		this.registeredOn = registeredOn;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderDetailId=" + orderDetailId + ", orderId=" + orderId + ", itemId=" + itemId
				+ ", itemName=" + itemName + ", itemCode=" + itemCode + ", unit=" + unit + ", spec=" + spec
				+ ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", receivedQuantity=" + receivedQuantity
				+ ", remark=" + remark + ", modifiedOn=" + modifiedOn + ", registeredOn=" + registeredOn + "]";
	}
	
}
