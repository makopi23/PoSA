package chapter01;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class QuantityTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

    @Test
    public void 数量が1以上100以下の場合のテスト() {
    	Quantity quantity = new Quantity(50);
        assertThat(quantity.value, is(50));
    }

    @Test
    public void 数量が1未満の場合のテスト() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("不正：" + Quantity.MIN + "未満");

        Quantity quantity = new Quantity(0);
    }

    @Test
    public void 数量が100より大きい場合のテスト() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("不正：" + Quantity.MAX + "超");

    	Quantity quantity = new Quantity(101);
    }

    @Test
    public void addメソッドで足し算の合計が100を超えないテスト() {
    	Quantity quantity1 = new Quantity(30);
    	Quantity quantity2 = new Quantity(70);

    	Quantity quantity3 =  quantity1.add(quantity2);
    	assertThat(quantity3.value, is(100));
    }

    @Test
    public void addメソッドで足し算の合計が100を超えるテスト() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("不正：合計が" + Quantity.MAX + "超");

    	Quantity quantity1 = new Quantity(30);
    	Quantity quantity2 = new Quantity(71);

    	Quantity quantity3 =  quantity1.add(quantity2);

    }
}