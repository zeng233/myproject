package com.achannel.json.jsonlib;

import java.io.File;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.io.FileUtils;


/**
 * @description: TODO
 *
 * @createTime: 2014年2月28日 下午10:12:13
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestJsonlib {
	public static void main(String[] args) throws Exception {
		TestJsonlib t = new TestJsonlib();
//		t.convertStringToJson();
		t.convertStringToJson1();
	}
	
	public void convertStringToJson() throws Exception {
		String area = FileUtils.readFileToString(new File("E:/workplace/achannel/src/main/resources/jsontemplate/area.json"));
//		System.out.println(area);
		
		JSONObject jsonObj = JSONObject.fromObject(area);
		JSONArray jsonArray = jsonObj.names();
		Object[] objs = jsonArray.toArray();
		for (Object o : objs) {
			//获取省
			JSONObject provinceJson = (JSONObject) jsonObj.get(String.valueOf(o));
//			System.out.println(provinceJson);
			Object cityObj = provinceJson.get("l");
			//市级分组
			JSONObject cityJson = JSONObject.fromObject(cityObj);
			JSONArray cityArray = cityJson.names();
			Object[] cities = cityArray.toArray();
			for (Object city : cities) {
				JSONObject tempJson = (JSONObject) cityJson.get(String.valueOf(city));
				Object districtObj = tempJson.get("l");
				//区域分组
				JSONObject districtJson = JSONObject.fromObject(districtObj);
				JSONArray districtArray = districtJson.names();
				Object[] districts = districtArray.toArray();
				for (Object dis : districts) {
					JSONObject disJson = (JSONObject) districtJson.get(dis);
//					System.out.println(disJson.get("g") + " : " + disJson.get("gn"));
				}
			}
		}
		
	}
	
	public void convertStringToJson1() throws Exception {
		String area = FileUtils.readFileToString(new File("E:/workplace/achannel/src/main/resources/jsontemplate/area.json"));
		JSONObject countryJson = JSONObject.fromObject(area);
		for (Object proviceKey : countryJson.keySet()) {
			JSONObject proviceJson = countryJson.getJSONObject(String.valueOf(proviceKey));
			JSONObject cityJsonArray = proviceJson.getJSONObject("l");
			
			for (Object cityKey : proviceJson.getJSONObject("l").keySet()) {
				JSONObject cityJson = cityJsonArray.getJSONObject(String.valueOf(cityKey));
				JSONObject districtJsonArray = cityJson.getJSONObject("l");
				
				for (Object districtKey : cityJson.getJSONObject("l").keySet()) {
					JSONObject districtJson = districtJsonArray.getJSONObject(String.valueOf(districtKey));
					System.out.println(proviceJson.get("g") + ":" + proviceJson.get("gn") + ","
							+ cityJson.get("g") + ":" + cityJson.get("gn") + "," +
							districtJson.get("g") + " : " + districtJson.get("gn"));
				}
			}
		}
	}
	
	
//	JSONObject jsonCountry = JSONObject.fromObject(str);
//	for(Object provinceKey : jsonCountry.keySet()){
//		JSONObject jsonProvince = jsonCountry.getJSONObject(String.valueOf(provinceKey));
//		for(Object cityKey : jsonProvince.getJSONObject("l").keySet()){
//			JSONObject jsonCity = jsonProvince.getJSONObject("l").getJSONObject(String.valueOf(cityKey));
//			for(Object cityDistrict : jsonCity.getJSONObject("l").keySet()){
//				JSONObject jsonDistr
//qiaoyao(乔耀) 19:23:57
//ict = jsonCity.getJSONObject("l").getJSONObject
}
