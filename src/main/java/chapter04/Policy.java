package chapter04;

import java.util.Set;

public class Policy {
	Set<Rule> rules;
	
	boolean complyWithAll(Value value) {
		for(Rule each : rules) {
			if(each.ng(value)) return false;
		}
		return true;	// すべてのルールに適合
	}
	
	boolean complyWithSome(Value value) {
		for(Rule each : rules) {
			if(each.ok(value)) return true;
		}
		return false;	// どのルールにも適合しない
	}
	
	void addRule(Rule rule) {
		rules.add(rule);
	}
}
