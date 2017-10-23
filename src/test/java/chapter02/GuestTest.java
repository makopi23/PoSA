package chapter02;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class GuestTest {

	@Test
	public void test() {
		Guest guest = new Guest(FeeType1.adult);
		assertThat(guest.isAdult(), is(true));
	}

}
