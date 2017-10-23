package chapter01;

public class Money {
	static final int MIN = 1;

	int value;

	public Money(int value) {
		if(value < MIN) throw new IllegalArgumentException("不正：" + MIN + "未満");
		this.value = value;
	}

	public Money minus(int value) {
		return new Money(this.value - value);
	}

	public Money multiply(int quantity) {
		return new Money(this.value * quantity);
	}
}
