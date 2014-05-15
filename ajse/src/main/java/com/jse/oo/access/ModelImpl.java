package com.jse.oo.access;

import com.jse.oo.polymorphic.Model;

/**
 * @description: TODO
 *
 * @createtime: 2013-5-28 下午11:00:20
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class ModelImpl extends Model {
	public static void main(String[] args) {
		Model m = new ModelImpl();
		m.t();//只有在同一个包下面，才可以访问Model的test方法，参考ModelSub就可以访问test方法
	}
}
