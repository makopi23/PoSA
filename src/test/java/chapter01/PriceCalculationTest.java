package chapter01;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class PriceCalculationTest {

	@Test
	public void 数量割引のテスト1() {
		PriceCalculation priceCalculation = new PriceCalculation();
		Money money = new Money(300);
		Quantity quantity = new Quantity(20);	// 5個以上なので割引対象となるはず
		Money price = priceCalculation.amount(money, quantity);
		assertThat(price.value, is((int)(300 * 20 * 0.9)));	// １割引される
	}

	@Test
	public void 数量割引のテスト2() {
		PriceCalculation priceCalculation = new PriceCalculation();
		Money money = new Money(300);
		Quantity quantity = new Quantity(3);	// 5個未満なので割引対象とならないはず
		Money price = priceCalculation.amount(money, quantity);
		assertThat(price.value, is((int)(300 * 3 * 1.0)));	// １割引されない
	}

}
