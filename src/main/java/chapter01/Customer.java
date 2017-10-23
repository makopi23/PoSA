package chapter01;

public class Customer {
	private String name;

	public Customer(String name) {
		this.name = name;
	}

	public String name() {
		return name;
	}

	// 値オブジェクトにするため、setterを設けない
	/***
	public void setName(String name) {
		this.name = name;
	}
	***/
}
