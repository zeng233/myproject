package com.jse.block.loop;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @description: 测试集合遍历
 *
 * @createtime: 2013-5-24 上午10:25:40
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestForeach {
	enum Face {
		ONE, TWO, THREE, FOUR, FIVE, SIX
	}

	enum Suit {
		CLUB, DIAMOND, HEART, SPADE
	}
	
	public void test() {
		Collection<Face> faces = Arrays.asList(Face.values());
		
		for (Iterator<Face> i = faces.iterator(); i.hasNext();) {
			Face face = i.next();
			// for循环初始化的时候不使用在一个块中的变量名i TODO
			for (Iterator<Face> j = faces.iterator(); j.hasNext();) {
				System.out.println(face + "" + j.next());
			}
		}
		
		//研究下Iterator TODO
		for (Iterator<Face> i = faces.iterator(); i.hasNext();)
			// for循环初始化的时候不使用在一个块中的变量名i TODO
			for (Iterator<Face> j = faces.iterator(); j.hasNext();) {
				System.out.println(i.next() + "" + j.next());
			}
			 
		
//		Collection<Suit> suits = Arrays.asList(Suit.values());
//		for (Iterator<Suit> i = suits.iterator(); i.hasNext();) {
//			Suit suit = i.next();
//		}
	}
	
	public static void main(String[] args) {
		TestForeach t = new TestForeach();
		t.test();
	}
}
