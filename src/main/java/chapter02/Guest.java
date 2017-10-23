package chapter02;

public class Guest {
	FeeType1 type;

	Guest(FeeType1 type){
		this.type = type;
	}

	boolean isAdult() {
		return type.equals(FeeType1.adult);
	}
}
