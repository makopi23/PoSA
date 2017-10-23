package chapter02;

public class Yen {
	private int yen;

	public Yen(int yen) {
		this.yen = yen;
	}

	public Yen() {
		this.yen = 0;
	}

	public int yen() {
		return yen;
	}

	public void add(Yen yen) {
		this.yen += yen.yen();
	}
}
