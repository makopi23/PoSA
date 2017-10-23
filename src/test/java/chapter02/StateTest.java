package chapter02;

import static chapter02.State.*;

import java.util.EnumSet;
import java.util.Set;

import org.junit.Test;

public class StateTest {

	@Test
	public void 状態の一覧を表示する() {
		System.out.println("--- 状態の一覧を表示する ---");
		State[] states = State.values();
		for (State state : states) {
			System.out.println(state);
		}
	}
	
	@Test
	public void 状態のグルーピング() {
		System.out.println("--- 状態のグルーピング ---");
		Set<State> nextSates = EnumSet.of(承認済, 差し戻し中);
		for (State state : nextSates) {
			System.out.println(state);
		}
	}
}
