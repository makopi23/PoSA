package chapter01;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class MoneyTest {

    @Test
    public void お金の引き算のテスト() {
    	Money money1 = new Money(300);
    	Money money2 = new Money(200);

    	// 金額の一致をテスト
        assertThat(money1.minus(100).value, is(money2.value));

        // 異なるオブジェクトであることのテスト
        assertThat(money1.minus(100).equals(money2), is(false));

    }

}