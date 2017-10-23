package chapter04;

public interface Rule {
	boolean ok(Value value);
	
	default boolean ng(Value value) {
		return ! ok( value );
	}
}
