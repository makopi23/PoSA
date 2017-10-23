package chapter02;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class FeeFactoryTest {

	@Test
	public void if文を使わずに区分オブジェクトを取得する() {
		Fee adult = FeeFactory.feeByName("adult");
		Fee child = FeeFactory.feeByName("child");
		assertThat(adult.label(), is("大人"));
		assertThat(child.label(), is("子供"));
	}

}
