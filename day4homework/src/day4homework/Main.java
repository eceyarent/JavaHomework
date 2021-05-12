package day4homework;

import java.time.LocalDate;

import day4homework.Abstracts.BaseCustomerManager;
import day4homework.Adapter.MernisServiceAdapter;
import day4homework.Concretes.StarbucksCustomerManager;
import day4homework.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer (1,"Ece Yaren","Taykutgül",LocalDate.of(1998,04,20),"38443691110"));
	}

}
