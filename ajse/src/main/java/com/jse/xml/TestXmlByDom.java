package com.jse.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/**
 * @description: DOM方式解析XML
 *
 * @createtime: 2013-11-6 下午10:33:43
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestXmlByDom {
	
	public void parseXml(String path) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		Document document = documentBuilder.parse(new File("E:/juno/winshare/ajse/src/main/resources/test/person.xml"));
		
		NodeList nodeList = document.getChildNodes();
	}
}
