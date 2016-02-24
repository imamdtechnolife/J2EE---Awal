package com.planetmars323.j2ee_demo;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class frame_imam extends JFrame{

	public frame_imam()
	{
		super("Imam Afriyadi");
		setLayout(new FlowLayout());
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Selamat Datang!");
		JButton button = new JButton("Tekan Tombol");
		
		panel.add(label);
		add(panel);
		add(button);
		
		penghendel hendel = new penghendel();
		button.addActionListener(hendel);
	}
	
	public class penghendel implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "selamat datang anonymous :)");
		}
	}
}
