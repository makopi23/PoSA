package chapter02;

public class Charge {
	Fee fee;

	Charge(Fee fee){
		this.fee = fee;
	}

	Yen yen() {
		return fee.yen();
	}
}
