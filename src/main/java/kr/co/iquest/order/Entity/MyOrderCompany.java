package kr.co.iquest.order.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "myordercompany")
@IdClass(MyOrderCompanyId.class)
public class MyOrderCompany implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3528681139761602185L;

	@Id
	@Column(name = "id")	
	public int id;
	
	@Id
	@Column(name = "ordercompanyid")
	public int orderCompanyId;
	
	@Column(name = "approvalcode")
	public int approvalCode;
	
	@Column(name = "registeredon")
	public Date registeredOn;
	
	@Column(name = "modifiedon")
	public Date modifiedOn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderCompanyId() {
		return orderCompanyId;
	}

	public void setOrderCompanyId(int orderCompanyId) {
		this.orderCompanyId = orderCompanyId;
	}

	public int getApprovalCode() {
		return approvalCode;
	}

	public void setApprovalCode(int approvalCode) {
		this.approvalCode = approvalCode;
	}

	public Date getRegisteredOn() {
		return registeredOn;
	}

	public void setRegisteredOn(Date registeredOn) {
		this.registeredOn = registeredOn;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	@Override
	public String toString() {
		return "MyOrderCompany [id=" + id + ", orderCompanyId=" + orderCompanyId + ", approvalCode="
				+ approvalCode + ", registeredOn=" + registeredOn + ", modifiedOn=" + modifiedOn + "]";
	}

	
}
