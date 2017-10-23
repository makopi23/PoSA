package chapter02;

import java.util.HashMap;
import java.util.Map;

public class FeeFactory {
	static Map<String, Fee> types;

	static {
		types = new HashMap<String, Fee>();
		types.put("adult", new AdultFee());
		types.put("child", new ChildFee());
	}

	static Fee feeByName(String name) {
		return types.get(name);
	}
}
