package com.pinball3d.effectinfo.api;

import java.util.HashMap;
import java.util.Map;

public class JEEAPI {
	private static Map<String, String> map = new HashMap<String, String>();

	public static void addDesc(String effectName, int level, String desc) {
		map.put(effectName + "." + level + ".desc", desc);
	}

	public static String getDesc(String key) {
		return map.get(key);
	}
}
