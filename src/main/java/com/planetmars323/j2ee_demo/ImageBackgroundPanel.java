package com.planetmars323.j2ee_demo;
import java.awt.*;
import javax.swing.*;

public class ImageBackgroundPanel extends JPanel{
	
	Image image;
	
	public ImageBackgroundPanel(Image image)
	{
		this.image = image;
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawImage(image, 0, 0, null);
	}
}
