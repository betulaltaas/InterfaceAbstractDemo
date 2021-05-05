package InterfaceAbstractOdev.Adapters;

import java.rmi.RemoteException;

import InterfaceAbstractOdev.Abstract.CustomerCheckService;
import InterfaceAbstractOdev.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean ChechkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return 	client.TCKimlikNoDogrula( Long.valueOf(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBird());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;		
	}

}
