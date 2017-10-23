package chapter02;

public class ChildFee implements Fee{
	public Yen yen() {
		return new Yen(50);
	}

	public String label() {
		return "子供";
	}
}
