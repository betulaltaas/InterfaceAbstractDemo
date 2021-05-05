package InterfaceAbstractOdev;

import InterfaceAbstractOdev.Abstract.BaseCustomerManeger;
import InterfaceAbstractOdev.Adapters.MernisServiceAdapter;
import InterfaceAbstractOdev.Concrete.*;
import InterfaceAbstractOdev.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseCustomerManeger customerManeger = new StarbucksCustomerManeger(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Betül");
		customer.setLastName("Altaþ");
		customer.setDateOfBird(1995);
		customer.setNationalityId("14778965");
	
		customerManeger.Save(customer);
	}

}
