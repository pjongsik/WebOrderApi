package kr.co.iquest.order.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.co.iquest.order.Entity.MyOrderCompany;

public interface MyOrderCompanyRepository extends CrudRepository<MyOrderCompany, Integer> {
	
	public List<MyOrderCompany> findById(int id);
	
	public List<MyOrderCompany> findByOrderCompanyId(int orderCompany);
	
	public MyOrderCompany findByIdAndOrderCompanyId(int id, int orderCompany);
	
}
