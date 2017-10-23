package chapter02;

public class SeniorFee implements Fee{
	public Yen yen() {
		return new Yen(80);
	}

	public String label() {
		return "シニア";
	}
}
