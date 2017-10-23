package chapter01;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CustomersTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void CustomersクラスのasListメソッドの戻り値がイミュータブルなListとなっていることのテスト() {
		thrown.expect(UnsupportedOperationException.class);

		Customer customer1 = new Customer("Hitachi Taro");
		Customer customer2 = new Customer("Hitachi Jiro");

		List<Customer> customerList = new ArrayList<Customer>();
		Customers customers = new Customers(customerList);
		Customers customers1 = customers.add(customer1);
		Customers customers2 = customers.add(customer2);

		List<Customer> unmodifiableList = customers2.asList();
		Customer customer3 = new Customer("Hitachi Saburo");
		unmodifiableList.set(0,  customer3);

	}

}
