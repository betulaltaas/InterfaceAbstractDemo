package InterfaceAbstractOdev.Concrete;

import InterfaceAbstractOdev.Abstract.BaseCustomerManeger;
import InterfaceAbstractOdev.Abstract.CustomerCheckService;
import InterfaceAbstractOdev.Entities.Customer;

public class StarbucksCustomerManeger extends BaseCustomerManeger implements CustomerCheckService {

	private CustomerCheckService _customerCheckService;
	
	
	public StarbucksCustomerManeger(CustomerCheckService _customerCheckService) { 
		this._customerCheckService = _customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		if(_customerCheckService.ChechkIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			System.out.println("Geçersiz Kiþi");
		}
		
		
	}

	@Override
	public boolean ChechkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		
		return true;
	}

	
	


}
