package com.BrickBreaker.com;

import javax.swing.JFrame;


public class Main1 {

	public static void main(String[] args) {
		JFrame obj=new JFrame();
		GamePlay1 gameplay=new GamePlay1();
		obj.setBounds(10,10,700,700);
		obj.setTitle("Breakout Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        obj.add(gameplay);
	} 

}
