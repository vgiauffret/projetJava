package com.jeudecarte.java;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CarteButton extends JButton implements ActionListener{

	
	public static final int ETAT_DOS = 0;
	public static final int ETAT_FACE = 1;
	public Carte carte;
	
	public int etat;
	
	public CarteButton(Carte carte){
		super();
		this.carte = carte;
		this.etat = 0;
		setIcon(carte.imageDos);
		setPreferredSize( new Dimension(carte.imageDos.getIconWidth(), carte.imageDos.getIconHeight())); 
		super.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(etat == ETAT_DOS){
			etat = ETAT_FACE;
			setIcon(carte.imageFace);
			this.setBounds(250, 250, 73, 97);
		}
		else{
			this.setBounds(250, 250, 73, 97);
		}
	}

}
