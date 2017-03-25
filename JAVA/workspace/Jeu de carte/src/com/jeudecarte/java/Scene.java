package com.jeudecarte.java;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Scene extends JPanel {

	//VARIABLES
	private ImageIcon icoFond;
	private Image imgFond;
	
	
	
	//CONSTRUCTEURS
	public Scene(){
		
		super();
		this.icoFond = new ImageIcon(getClass().getResource("/Tapis.gif"));
		this.imgFond = this.icoFond.getImage();
	}
	
	
	//METHODES
	public void paintComponent(Graphics g){
		g.drawImage(this.imgFond, 0, 0, null);
	}
	
}
