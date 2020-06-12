package kr.co.iquest.order.Service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.iquest.order.Entity.MyOrderCompany;
import kr.co.iquest.order.Entity.OrderCompany;
import kr.co.iquest.order.Repository.MyOrderCompanyRepository;

@Service
public class VendorServiceImpl implements VendorService {

	private MyOrderCompanyRepository myOrderCompanyRepository;
	
	@Autowired
	public VendorServiceImpl(MyOrderCompanyRepository myOrderCompanyRepository) {
		this.myOrderCompanyRepository = myOrderCompanyRepository;
	}

	@Override
	public MyOrderCompany UpdateApplovalCode(int userId, int orderCompanyId, boolean isApproval) {
	
		MyOrderCompany myOrderCompany = myOrderCompanyRepository.findByIdAndOrderCompanyId(userId, orderCompanyId);
		
		if (myOrderCompany != null) {
			myOrderCompany.setApprovalCode(isApproval ? 3001 : 3003);
			myOrderCompany.setModifiedOn(new Date());
			myOrderCompanyRepository.save(myOrderCompany);
		}
		
		return myOrderCompany;
	}

	@Override
	public OrderCompany save(OrderCompany orderCompany) {
		
		return null;
	}

	@Override
	public Iterable<OrderCompany> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<OrderCompany> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
