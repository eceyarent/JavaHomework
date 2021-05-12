package day4homework.Adapter;

import day4homework.Abstracts.CustomerCheckService;
import day4homework.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		Boolean result=false;
		try {
			result=proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),
				customer.getDateOfBirth().getYear());
		}catch (Exception e)
		{
		System.out.println("Not a valid person");
		}
		return result;
	}
		
	}
	


