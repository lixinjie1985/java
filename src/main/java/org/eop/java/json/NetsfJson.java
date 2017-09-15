package org.eop.java.json;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


/**
 * @author lixinjie
 * @since 2017-09-13
 */
public class NetsfJson {

	public static void main(String[] args) {
		mapJson();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void mapJson() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", "李新杰");
		map.put("age", 32);
		map.put("married", true);
		map.put("phones", Arrays.asList("136", "138"));
		
		Map<String, Object> scores = new HashMap<>();
		scores.put("chinese", 135);
		scores.put("math", 140);
		map.put("scores", scores);
		
		Map<String, Object> map1 = new HashMap<>();
		map1.put("2016", "1000");
		map1.put("2017", "1000");
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("2016", "1000");
		map2.put("2017", "1000");
		
		Map<String, Object> map3 = new HashMap<>();
		map3.put("2016", "1000");
		map3.put("2017", "1000");
		
		map.put("years", Arrays.asList(map1, map2, map3));
		
		System.out.println(map);
		System.out.println();
		//将map转化为json字符串
		String jsonStr = JSONObject.fromObject(map).toString();
		System.out.println(jsonStr);
		System.out.println();
		//将json字符串转化为json对象
		JSONObject jsonObj = JSONObject.fromObject(jsonStr);
		//获取json对象中的单个值
		System.out.println(jsonObj.getString("name"));
		System.out.println(jsonObj.getInt("age"));
		System.out.println(jsonObj.getBoolean("married"));
		//获取json对象中的json对象
		JSONObject scoresObj = jsonObj.getJSONObject("scores");
		System.out.println(scoresObj.getInt("chinese"));
		System.out.println(scoresObj.getInt("math"));
		//获取json对象中的json数组
		JSONArray phoneArr = jsonObj.getJSONArray("phones");
		//json数组可以当作List使用，因实现了List接口
		List<String> phones = (List)phoneArr;
		//列表中的每项是字符串
		for (String phone : phones) {
			System.out.println(phone);
		}
		//获取json对象中的json数组
		JSONArray yearArr = jsonObj.getJSONArray("years");
		List<JSONObject> years = (List)yearArr;
		//列表中的每项是json对象
		for (JSONObject year : years) {
			System.out.println(year.get("2016"));
		}
	}
}
