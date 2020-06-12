package kr.co.iquest.order.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "ordercompany")
public class OrderCompany implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6058741794495353229L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "ordercompanyid")
	public int orderCompanyId;
	
	@Column(name = "loginid")
	public String loginId;
	
	@Column(name = "password")
	public String password;
	
	@Column(name = "businessnumber")
	public String businessNumber;
	
	@Column(name = "companyname")
	public String companyName;
	
	@Column(name = "telephone")
	public String telephone;
	
	@Column(name = "mobile")
	public String mobile;
	
	@Column(name = "staffname")
	public String staffName;
	
	@Column(name = "registeredon")
	public Date registeredOn;
	
	public int getOrderCompanyId() {
		return orderCompanyId;
	}
	public void setOrderCompanyId(int orderCompanyId) {
		this.orderCompanyId = orderCompanyId;
	}
	public String getBusinessNumber() {
		return businessNumber;
	}
	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public Date getRegisteredOn() {
		return registeredOn;
	}
	public void setRegisteredOn(Date registeredOn) {
		this.registeredOn = registeredOn;
	}
	@Override
	public String toString() {
		return "OrderCompany [orderCompanyId=" + orderCompanyId + ", loginId=" + loginId + ", password=" + password
				+ ", businessNumber=" + businessNumber + ", companyName=" + companyName + ", telephone=" + telephone
				+ ", mobile=" + mobile + ", staffName=" + staffName + ", registeredOn=" + registeredOn + "]";
	}
}
