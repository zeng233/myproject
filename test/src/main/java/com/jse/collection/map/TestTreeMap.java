package com.jse.collection.map;

import java.util.Map;
import java.util.TreeMap;


/**
 * @description: http://stackoverflow.com/questions/109383/how-to-sort-a-mapkey-value-on-the-values-in-java 参考Map排序
 *
 * @createtime: 2013-9-5 下午12:39:47
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestTreeMap {
	public static void main(String[] args) {
		Map<String, String> reqParams = new TreeMap<>();
		reqParams.put("gShopID", "1");
		reqParams.put("o", "2");
		reqParams.put("outerOrderID", "3");
		reqParams.put("productID", "4");
		reqParams.put("oit", "5");
		reqParams.put("os", "6");
		reqParams.put("sm", "7");
		reqParams.put("pm", "8");
		reqParams.put("sendMode", "9");
		reqParams.put("name", "10");
		reqParams.put("lastModifyTime_start", "11");
		reqParams.put("lastModifyTime_end", "12");
		reqParams.put("osd", "13");
		reqParams.put("oed", "14");
		reqParams.put("sgsd", "15");
		reqParams.put("sged", "16");
		reqParams.put("ol", "17");
		reqParams.put("pageSize", "18");
		reqParams.put("p", "19");
		
		System.out.println(reqParams);
		
		for (Map.Entry<String, String> entry : reqParams.entrySet()) {
			System.out.println("key: " + entry.getKey() + ", value:" + entry.getValue());
		}
	}
}
