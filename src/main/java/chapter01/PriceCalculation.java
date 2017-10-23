package chapter01;

public class PriceCalculation {

	/**
	 * 割引率
	 */
	private double discountRate = 0.1;

	/**
	 * 代金計算を行う
	 * @param unitPrice
	 * @param quantity
	 * @return
	 */
	Money amount(Money unitPrice, Quantity quantity) {
		// 数量割引判定
		if(quantity.isDiscountable()) {
			// 数量割引可
			return discount(unitPrice, quantity);
		}

		// 数量割引不可
		return unitPrice.multiply(quantity.value());
	}

	/**
	 * 代金の数量割引を行う
	 * @param unitPrice
	 * @param quantity
	 * @return
	 */
	private Money discount(Money unitPrice, Quantity quantity) {
		Money account = unitPrice.multiply(quantity.value());
		return new Money((int)(account.value * (1.0 - discountRate)));
	}
}
