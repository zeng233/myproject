package com.apattern.observer.awt;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @description: 监听器，继承一个抽象类，只需实现自己需要的操作
 *
 * @createtime: 2014-5-21 上午10:42:03
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class BConcreteListener extends MouseAdapter {
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("BConcreteListener's mouseClicked is invoked : XOnScreen is " + e.getXOnScreen());
	}
}
