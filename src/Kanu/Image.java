package Kanu;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Image extends JPanel{
	public java.awt.Image img;
	
	public ImagePanel (Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}
	
	
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}

}
