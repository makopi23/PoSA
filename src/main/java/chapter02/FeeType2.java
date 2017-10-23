package chapter02;

enum FeeType2 {
	//列挙子の定義は、コンストラクタに合わせた引数を持たせる。
	adult( new AdultFee() ),
	child( new ChildFee() ),
	senior( new SeniorFee());

	private Fee fee;

	//enum内に定義できるコンストラクターは、privateのみ可能らしい。
	private FeeType2(Fee fee) {
		this.fee = fee;
	}

	Yen yen() {
		return fee.yen();
	}

	String label() {
		return fee.label();
	}

}
