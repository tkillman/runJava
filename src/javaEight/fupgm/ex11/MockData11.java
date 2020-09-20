package javaEight.fupgm.ex11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockData11 {
	
	public static List<Map<String, Object>> makeMock(){
		Map<String, Object> map1 = new HashMap<>();
		map1.put("score1", 1);
		map1.put("score2", 10);
		map1.put("score3", 1);
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("score1", 11);
		map2.put("score2", 14);
		map2.put("score3", 2);
		
		List<Map<String, Object>> mapList = new ArrayList<>();
		mapList.add(map1); mapList.add(map2);
		return mapList;
	}
}
