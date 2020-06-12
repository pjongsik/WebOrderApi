package kr.co.iquest.order.Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Items implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8213172864991443001L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "itemid")
	public int itemId;
	
	@Column(name = "ordercompanyid")
	public int orderCompanyId;
	
	public int id;
	
	@Column(name = "itemname")
	public String itemName;
	
	@Column(name = "itemcode")
	public String itemCode;
	
	@Column(name = "unitprice")
	public BigDecimal unitPrice;
	
	public String unit;
	
	public String spec;
	
	public String remark;
	
	@Column(name = "registeredon")
	public Date registeredOn;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
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

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getRegisteredOn() {
		return registeredOn;
	}

	public void setRegisteredOn(Date registeredOn) {
		this.registeredOn = registeredOn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", orderCompanyId=" + orderCompanyId + ", id=" + id + ", itemName="
				+ itemName + ", itemCode=" + itemCode + ", unitPrice=" + unitPrice + ", unit=" + unit + ", spec=" + spec
				+ ", remark=" + remark + ", registeredOn=" + registeredOn + "]";
	}
	
}
