package com.apattern.observer.awt;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @description: 监听者，实现接口，把所有操作都要实现
 *
 * @createtime: 2014-5-21 上午9:40:29
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class AConcreteListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("AConcreteListener's mouseClicked is invoked : when : " + e.getWhen());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
