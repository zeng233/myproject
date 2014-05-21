package com.apattern.observer.awt;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @description: 主题以及观察者合为一体
 *
 * @createtime: 2014-5-21 上午10:54:31
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestFrame extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8030227011044826594L;
	
	public static void main(String[] args) {
		Frame frame = new TestFrame();
		frame.setBounds(200, 200, 200, 200);
		frame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouseClicked is invoked");
			}
		});
		frame.setVisible(true);
	}
}
