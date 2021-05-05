package InterfaceAbstractOdev.Abstract;

import InterfaceAbstractOdev.Entities.Customer;

public abstract class BaseCustomerManeger implements CustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("Veri Tabanýna Eklendi " + customer.getFirstName());
		
	}

}
