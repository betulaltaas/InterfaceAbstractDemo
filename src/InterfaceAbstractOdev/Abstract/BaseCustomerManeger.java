package InterfaceAbstractOdev.Abstract;

import InterfaceAbstractOdev.Entities.Customer;

public abstract class BaseCustomerManeger implements CustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("Veri Taban�na Eklendi " + customer.getFirstName());
		
	}

}
