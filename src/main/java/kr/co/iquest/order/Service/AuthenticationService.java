package kr.co.iquest.order.Service;

import kr.co.iquest.order.Entity.OrderCompany;
import kr.co.iquest.order.Entity.User;

public interface AuthenticationService {
	User authenticate(String token);

	OrderCompany vendorAuthenticate(String token);
}
