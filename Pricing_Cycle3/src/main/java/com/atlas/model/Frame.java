package com.atlas.model;

import java.util.HashMap;
import java.util.Map;

public class Frame {

	private String FrameTypes;

	public Double getFramePrice(String frameMaterialType) {
		Map<String, Double> map = new HashMap<>();
		map.put("Steel", 1000D);
		map.put("Aluminum", 1500D);
		map.put("Titanium", 2000D);
		return map.get(frameMaterialType);
	}

	public String getFrameMaterialTypes() {
		return FrameTypes;
	}

	public void setFrameMaterialTypes(String frameMaterialTypes) {
		FrameTypes = frameMaterialTypes;
	}

}
