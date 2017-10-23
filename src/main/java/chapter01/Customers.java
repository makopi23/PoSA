package chapter01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customers {
	List<Customer> customers;

	public Customers(List<Customer> customers) {
		this.customers = customers;
	}

	Customers add(Customer customer) {
		List<Customer> result = new ArrayList<>(customers);
		result.add(customer);
		return new Customers(result);
	}

	List<Customer> asList(){
		return Collections.unmodifiableList(customers);
	}
}
