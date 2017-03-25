package com.jeudecarte.java;

import javax.swing.ImageIcon;

public class Carte {

	
	
	public ImageIcon imageFace;
	public ImageIcon imageDos;

	public Carte(String face, String dos){
		this.imageFace = new ImageIcon( getClass().getResource( face));
		this.imageDos = new ImageIcon( getClass().getResource( dos));
	}
}
