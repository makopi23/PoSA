package chapter01;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class ShippingCostTest {

    @Test
    public void 送料が有料になる場合のテスト() {
        assertThat(shippingCost(300), is(500));
    }

    @Test
    public void 送料が無料になる場合のテスト() {
        assertThat(shippingCost(4000), is(0));
    }

    // 送料を算出する
	int shippingCost(int basePrice) {
		ShippingCost cost = new ShippingCost(basePrice);
		return cost.amount();
	}

}