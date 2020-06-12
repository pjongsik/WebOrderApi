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
@Table(name = "users")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7319423755172948942L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public int id;
	
	@Column(name = "loginid")
	public String loginId;
	
	@Column(name = "password")
	public String password;
	
	@Column(name = "businessnumber")
	public String businessNumber;
	
	@Column(name = "companyname")
	public String companyName;
	
	@Column(name = "mobile")
	public String mobile;
	
	@Column(name = "telephone")
	public String telephone;
	
	@Column(name = "staffname")
	public String staffName;
	
	@Column(name = "email")
	public String email;
	
	@Column(name = "registeredon")
	public Date registeredOn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		return "User [id=" + id + ", loginId=" + loginId + ", password="
				+ password + ", businessNumber=" + businessNumber + ", companyName=" + companyName + ", mobile="
				+ mobile + ", telephone=" + telephone + ", staffName=" + staffName + ", email=" + email
				+ ", registeredOn=" + registeredOn + "]";
	}
}
