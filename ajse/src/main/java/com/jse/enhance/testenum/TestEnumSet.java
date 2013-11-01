package com.jse.enhance.testenum;

import java.util.EnumSet;

//import com.myenum.test.EnumImpl.*;

/**
 * description: EnumSet
 *
 * createtime: 2012-7-20 下午03:13:17
 *
 * @author zenghua
 * @version 1.0
 */

public class TestEnumSet {
	public static void main(String[] args) {
		EnumSet<EnumConstants> enumSet = EnumSet.noneOf(EnumConstants.class);
		enumSet.add(EnumConstants.BLUEDAIVE);
	}
}

enum EnumConstants {
	ROSE, JACK, BLUEDAIVE
}