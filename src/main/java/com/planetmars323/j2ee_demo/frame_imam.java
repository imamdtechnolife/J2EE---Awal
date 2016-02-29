package com.planetmars323.j2ee_demo;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class frame_imam extends JFrame{

	Image image;
	ImageBackgroundPanel panel;
	
	public frame_imam()
	{
		super("Imam Afriyadi");
		initComponent();
	}
	
	public void initComponent()
	{
		image = new ImageIcon("imam.jpg").getImage();
		panel = new ImageBackgroundPanel(image);
		setPreferredSize(new Dimension(image.getWidth(null), image.getHeight(null)));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
