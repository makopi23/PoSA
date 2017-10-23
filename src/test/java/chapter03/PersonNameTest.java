package chapter03;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;
public class PersonNameTest {

	@Test
	public void test() {
		PersonName personName = new PersonName("Hitachi", "Taro");
		assertThat(personName.fullName(), is("Hitachi Taro"));
	}

}
