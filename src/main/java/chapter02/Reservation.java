package chapter02;

import java.util.ArrayList;
import java.util.List;

public class Reservation {
	List<Fee> fees;		// 大人と子供の内訳は不明

	public Reservation() {
		fees = new ArrayList<Fee>();
	}

	void addFee(Fee fee) {
		fees.add(fee);	// 大人でも子供でも追加できる
	}

	Yen feeTotal() {
		Yen total = new Yen();	// 合計ゼロ円
		for( Fee each : fees ) {
			total.add( each.yen() );
		}
		return total;
	}

	/**
	 * 料金区分から料金を計算するメソッド
	 * @param feeTypename
	 * @return
	 */
	Yen feeFor(String feeTypename) {
		FeeType2 feeType2 = FeeType2.valueOf(feeTypename);
		return feeType2.yen();
	}
}
