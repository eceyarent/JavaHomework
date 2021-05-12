package day4homework.Concretes;

import day4homework.Abstracts.CustomerCheckService;
import day4homework.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		
		return true;
		
	}

}
