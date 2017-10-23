package chapter02;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class ReservationTest {

	@Test
	public void 子供連れの団体の料金の合計を計算する() {
		Reservation reservation = new Reservation();
		AdultFee adultFee = new AdultFee();
		ChildFee childFee = new ChildFee();

		reservation.addFee(adultFee);
		reservation.addFee(childFee);

		assertThat(reservation.feeTotal().yen(), is(150));
	}

	@Test
	public void 料金区分から料金を計算する() {
		Reservation reservation = new Reservation();
		Yen adultFee = reservation.feeFor("adult");
		assertThat(adultFee.yen(), is(100));
	}

}
