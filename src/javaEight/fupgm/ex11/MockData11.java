package javaEight.fupgm.ex11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockData11 {
	
	public static List<Map<String, Object>> makeMock(){
		Map<String, Object> map1 = new HashMap<>();
		map1.put("stdntUno", 1);
		map1.put("score1", 7);
		map1.put("score2", 20);
		map1.put("score3", 15);
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("stdntUno", 2);
		map2.put("score1", 11);
		map2.put("score2", 14);
		map2.put("score3", 20);
		
		List<Map<String, Object>> mapList = new ArrayList<>();
		mapList.add(map1); mapList.add(map2);
		return mapList;
	}
	
	
	public static Map<String, Object> makeStandMock(){
		Map<String, Object> stand = new HashMap<>();
		stand.put("score1", 6); //둘다 높음
		stand.put("score2", 15); // map1만 높음
		stand.put("score3", 17); // map2만 높음

		return stand;
	}
}
