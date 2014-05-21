package com.apattern.observer.awt;

import java.awt.Frame;
import java.awt.event.MouseListener;

/**
 * @description: 主题,事件-监听 模式
 *
 * @createtime: 2014-5-21 上午9:37:43
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class AConcreteFrame extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8894836561997131551L;
	

	public static void main(String[] args) {
		AConcreteFrame frame = new AConcreteFrame();
		MouseListener a = new AConcreteListener();
		MouseListener b = new BConcreteListener();
		
		frame.addMouseListener(a);
		frame.addMouseListener(b);
		frame.setBounds(400, 300, 200, 200);
		frame.setVisible(true);
	}
}
