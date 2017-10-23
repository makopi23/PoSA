package chapter01;

public class ShippingCost {
	static final int minimumForFree = 3000;
	static final int cost = 500;

	int basePrice;

	public ShippingCost(int basePrice) {
		this.basePrice = basePrice;
	}

	int amount() {
		if( basePrice < minimumForFree ) return cost;
		return 0;
	}
}
