package chapter02;

import static chapter02.State.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class StateTransitionsTest {

	@Test
	public void 審査中から承認済に遷移できることを確認する() {
		StateTransitions stateTransitions = new StateTransitions();
		assertThat(stateTransitions.canTransit(審査中, 承認済), is(true));
	}
	
	@Test
	public void 審査中から終了に遷移できないことを確認する() {
		StateTransitions stateTransitions = new StateTransitions();
		assertThat(stateTransitions.canTransit(審査中, 終了), is(false));
	}

}
