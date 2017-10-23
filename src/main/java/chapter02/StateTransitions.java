package chapter02;

import static chapter02.State.*;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StateTransitions {
	Map<State, Set<State>> allowed;
	
	{
		allowed = new HashMap<>();
		
		allowed.put(審査中, EnumSet.of(承認済, 差し戻し中));
		allowed.put(差し戻し中, EnumSet.of(審査中, 終了));
		allowed.put(承認済, EnumSet.of(実施中, 終了));
		allowed.put(実施中, EnumSet.of(中断中, 終了));
		allowed.put(中断中, EnumSet.of(実施中, 終了));
	}
	
	boolean canTransit(State from, State to) {
		Set<State> allowedStates = allowed.get(from);
		return allowedStates.contains(to);
	}
}
