package com.jse.enhance.enum1;

/**
 * description: TODO
 *
 * createtime: 2012-7-20 上午10:47:41
 *
 * @author zenghua
 * @version 1.0
 */

interface IFather {
//	public static String name = "duke";
	public void get();
}

public enum EnumImpl implements IFather {
	A, B, C;

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}
	
}
