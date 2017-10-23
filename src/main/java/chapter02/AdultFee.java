package chapter02;

public class AdultFee implements Fee{
	public Yen yen() {
		return new Yen(100);
	}

	public String label() {
		return "大人";
	}
}
