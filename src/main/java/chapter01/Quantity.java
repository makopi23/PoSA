package chapter01;

public class Quantity {
	static final int MIN = 1;
	static final int MAX = 100;

	int value;
	private static final int discountCriteria = 5;
	//boolean isDiscountable = false;

	public Quantity(int value) {
//		if(checkQuantityRange(value)) {
//			this.value = value;
//		}
		if(value < MIN) throw new IllegalArgumentException("不正：" + MIN + "未満");
		if(value > MAX) throw new IllegalArgumentException("不正：" + MAX + "超");
		this.value = value;
	}

//	public Quantity(int value, boolean isDiscountable) {
//		if(checkQuantityRange(value)) {
//			this.value = value;
//			this.isDiscountable = isDiscountable;
//		}
//	}

//	private boolean checkQuantityRange(int value) {
//		if(value < MIN) throw new IllegalArgumentException("不正：" + MIN + "未満");
//		if(value > MAX) throw new IllegalArgumentException("不正：" + MAX + "超");
//		return true;
//	}

	boolean canAdd(Quantity other) {
		int added = addValue(other);
		return added <= MAX;
	}

	Quantity add(Quantity other) {
		if(!canAdd(other)) throw new IllegalArgumentException("不正：合計が" + MAX + "超");
		int added = addValue(other);
		return new Quantity(added);
	}

	private int addValue(Quantity other) {
		return this.value + other.value;
	}

	public int value() {
		return value;
	}

	public boolean isDiscountable() {
		return value >= discountCriteria ;
	}

}
