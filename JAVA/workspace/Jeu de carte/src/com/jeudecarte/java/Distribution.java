package com.jeudecarte.java;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Distribution {
	
	public Scene scene;
	public JFrame fenetre;
	public CarteButton carteCentre;
	
	
	public Distribution(Scene scene, JFrame fenetre){
		this.scene = scene;
		this.fenetre = fenetre;
		
		int lowerindex = 1;
		int higherindex = 8;
		int lowercouleur = 1;
		int highercouleur = 4;

		int i;
		int couleur;
		String carteS;
		
		
		//Carte centre******************************************************************
		i = (int)(Math.random() * (higherindex-lowerindex)) + lowerindex;
		couleur = (int)(Math.random() * (highercouleur-lowercouleur)) + lowercouleur;
		carteS = "/"+i+couleur+".gif";
		if(couleur == 1){
			Carte carreau = new Carte("/1.gif", "/1.gif");
			scene.setLayout(null);
			CarteButton btncarreau = new CarteButton(carreau);
			btncarreau.setBounds(250, 200, 21, 21);
			fenetre.getContentPane().add(btncarreau);
		}
		if(couleur ==2){
			Carte coeur = new Carte("/2.gif", "/2.gif");
			scene.setLayout(null);
			CarteButton btncoeur = new CarteButton(coeur);
			btncoeur.setBounds(250, 200, 21, 21);
			fenetre.getContentPane().add(btncoeur);
		}
		if(couleur ==3){
			Carte pique = new Carte("/3.gif", "/3.gif");
			scene.setLayout(null);
			CarteButton btnpique = new CarteButton(pique);
			btnpique.setBounds(250, 200, 21, 21);
			fenetre.getContentPane().add(btnpique);
		}
		if(couleur ==4){
			Carte trefle = new Carte("/4.gif", "/4.gif");
			scene.setLayout(null);
			CarteButton btntrefle = new CarteButton(trefle);
			btntrefle.setBounds(250, 200, 21, 21);
			fenetre.getContentPane().add(btntrefle);
		}
		Carte carte1 = new Carte(carteS, carteS);
		scene.setLayout(null);
		CarteButton btncarte1 = new CarteButton(carte1);
					carteCentre = btncarte1;
		btncarte1.setBounds(250, 250, 73, 97);
		fenetre.getContentPane().add(btncarte1);
		
		
		//Carte Nord************************************************************
			
			i = (int)(Math.random() * (higherindex-lowerindex)) + lowerindex;
			couleur = (int)(Math.random() * (highercouleur-lowercouleur)) + lowercouleur;
			carteS = "/"+i+couleur+".gif";
			Carte cartenord1 = new Carte(carteS, "/Back.gif");
			scene.setLayout(null);
			CarteButton btncartenord1 = new CarteButton(cartenord1);
			btncartenord1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(carteCentre == null){
						carteCentre = (CarteButton)e.getSource();
					}else{
						carteCentre.setVisible(false);
						carteCentre = (CarteButton)e.getSource();
					}
				}
			});
			btncartenord1.setBounds(200, 15, 73, 97);
			fenetre.getContentPane().add(btncartenord1);
			i = (int)(Math.random() * (higherindex-lowerindex)) + lowerindex;
			couleur = (int)(Math.random() * (highercouleur-lowercouleur)) + lowercouleur;
			carteS = "/"+i+couleur+".gif";
			Carte cartenord2 = new Carte(carteS, "/Back.gif");
			scene.setLayout(null);
			CarteButton btncartenord2 = new CarteButton(cartenord2);
			btncartenord2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(carteCentre == null){
						carteCentre = (CarteButton)e.getSource();
					}else{
						carteCentre.setVisible(false);
						carteCentre = (CarteButton)e.getSource();
					}
				}
			});
			btncartenord2.setBounds(250, 15, 73, 97);
			fenetre.getContentPane().add(btncartenord2);
			i = (int)(Math.random() * (higherindex-lowerindex)) + lowerindex;
			couleur = (int)(Math.random() * (highercouleur-lowercouleur)) + lowercouleur;
			carteS = "/"+i+couleur+".gif";
			Carte cartenord3 = new Carte(carteS, "/Back.gif");
			scene.setLayout(null);
			CarteButton btncartenord3 = new CarteButton(cartenord3);
			btncartenord3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(carteCentre == null){
						carteCentre = (CarteButton)e.getSource();
					}else{
						carteCentre.setVisible(false);
						carteCentre = (CarteButton)e.getSource();
					}
				}
			});
			btncartenord3.setBounds(300, 15, 73, 97);
			fenetre.getContentPane().add(btncartenord3);
			i = (int)(Math.random() * (higherindex-lowerindex)) + lowerindex;
			couleur = (int)(Math.random() * (highercouleur-lowercouleur)) + lowercouleur;
			carteS = "/"+i+couleur+".gif";
			Carte cartenord4 = new Carte(carteS, "/Back.gif");
			scene.setLayout(null);
			CarteButton btncartenord4 = new CarteButton(cartenord4);
			btncartenord4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(carteCentre == null){
						carteCentre = (CarteButton)e.getSource();
					}else{
						carteCentre.setVisible(false);
						carteCentre = (CarteButton)e.getSource();
					}
				}
			});
			btncartenord4.setBounds(350, 15, 73, 97);
			fenetre.getContentPane().add(btncartenord4);
			
			//Carte Ouest***************************************************************
			i = (int)(Math.random() * (higherindex-lowerindex)) + lowerindex;
			couleur = (int)(Math.random() * (highercouleur-lowercouleur)) + lowercouleur;
			carteS = "/"+i+couleur+".gif";
			Carte carteouest1 = new Carte(carteS, "/Back-90.gif");
			scene.setLayout(null);
			CarteButton btncarteouest1 = new CarteButton(carteouest1);
			btncarteouest1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(carteCentre == null){
						carteCentre = (CarteButton)e.getSource();
					}else{
						carteCentre.setVisible(false);
						carteCentre = (CarteButton)e.getSource();
					}
				}
			});
			btncarteouest1.setBounds(15, 200, 118, 73);
			fenetre.getContentPane().add(btncarteouest1);
			i = (int)(Math.random() * (higherindex-lowerindex)) + lowerindex;
			couleur = (int)(Math.random() * (highercouleur-lowercouleur)) + lowercouleur;
			carteS = "/"+i+couleur+".gif";
			Carte carteouest2 = new Carte(carteS, "/Back-90.gif");
			scene.setLayout(null);
			CarteButton btncarteouest2 = new CarteButton(carteouest2);
			btncarteouest2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(carteCentre == null){
						carteCentre = (CarteButton)e.getSource();
					}else{
						carteCentre.setVisible(false);
						carteCentre = (CarteButton)e.getSource();
					}
				}
			});
			btncarteouest2.setBounds(15, 250, 118, 73);
			fenetre.getContentPane().add(btncarteouest2);
			i = (int)(Math.random() * (higherindex-lowerindex)) + lowerindex;
			couleur = (int)(Math.random() * (highercouleur-lowercouleur)) + lowercouleur;
			carteS = "/"+i+couleur+".gif";
			Carte carteouest3 = new Carte(carteS, "/Back-90.gif");
			scene.setLayout(null);
			CarteButton btncarteouest3 = new CarteButton(carteouest3);
			btncarteouest3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(carteCentre == null){
						carteCentre = (CarteButton)e.getSource();
					}else{
						carteCentre.setVisible(false);
						carteCentre = (CarteButton)e.getSource();
					}
				}
			});
			btncarteouest3.setBounds(15, 300, 118, 73);
			fenetre.getContentPane().add(btncarteouest3);
			i = (int)(Math.random() * (higherindex-lowerindex)) + lowerindex;
			couleur = (int)(Math.random() * (highercouleur-lowercouleur)) + lowercouleur;
			carteS = "/"+i+couleur+".gif";
			Carte carteouest4 = new Carte(carteS, "/Back-90.gif");
			scene.setLayout(null);
			CarteButton btncarteouest4 = new CarteButton(carteouest4);
			btncarteouest4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(carteCentre == null){
						carteCentre = (CarteButton)e.getSource();
					}else{
						carteCentre.setVisible(false);
						carteCentre = (CarteButton)e.getSource();
					}
				}
			});
			btncarteouest4.setBounds(15, 350, 118, 73);
			fenetre.getContentPane().add(btncarteouest4);
			
			//Carte Est*********************************************************
			i = (int)(Math.random() * (higherindex-lowerindex)) + lowerindex;
			couleur = (int)(Math.random() * (highercouleur-lowercouleur)) + lowercouleur;
			carteS = "/"+i+couleur+".gif";
			Carte carteest1 = new Carte(carteS, "/Back-90.gif");
			scene.setLayout(null);
			CarteButton btncarteest1 = new CarteButton(carteest1);
			btncarteest1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(carteCentre == null){
						carteCentre = (CarteButton)e.getSource();
					}else{
						carteCentre.setVisible(false);
						carteCentre = (CarteButton)e.getSource();
					}
				}
			});
			btncarteest1.setBounds(480, 200, 118, 73);
			fenetre.getContentPane().add(btncarteest1);
			i = (int)(Math.random() * (higherindex-lowerindex)) + lowerindex;
			couleur = (int)(Math.random() * (highercouleur-lowercouleur)) + lowercouleur;
			carteS = "/"+i+couleur+".gif";
			Carte carteest2 = new Carte(carteS, "/Back-90.gif");
			scene.setLayout(null);
			CarteButton btncarteest2 = new CarteButton(carteest2);
			btncarteest2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(carteCentre == null){
						carteCentre = (CarteButton)e.getSource();
					}else{
						carteCentre.setVisible(false);
						carteCentre = (CarteButton)e.getSource();
					}
				}
			});
			btncarteest2.setBounds(480, 250, 118, 73);
			fenetre.getContentPane().add(btncarteest2);
			i = (int)(Math.random() * (higherindex-lowerindex)) + lowerindex;
			couleur = (int)(Math.random() * (highercouleur-lowercouleur)) + lowercouleur;
			carteS = "/"+i+couleur+".gif";
			Carte carteest3 = new Carte(carteS, "/Back-90.gif");
			scene.setLayout(null);
			CarteButton btncarteest3 = new CarteButton(carteest3);
			btncarteest3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(carteCentre == null){
						carteCentre = (CarteButton)e.getSource();
					}else{
						carteCentre.setVisible(false);
						carteCentre = (CarteButton)e.getSource();
					}
				}
			});
			btncarteest3.setBounds(480, 300, 118, 73);
			fenetre.getContentPane().add(btncarteest3);
			i = (int)(Math.random() * (higherindex-lowerindex)) + lowerindex;
			couleur = (int)(Math.random() * (highercouleur-lowercouleur)) + lowercouleur;
			carteS = "/"+i+couleur+".gif";
			Carte carteest4 = new Carte(carteS, "/Back-90.gif");
			scene.setLayout(null);
			CarteButton btncarteest4 = new CarteButton(carteest4);
			btncarteest4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(carteCentre == null){
						carteCentre = (CarteButton)e.getSource();
					}else{
						carteCentre.setVisible(false);
						carteCentre = (CarteButton)e.getSource();
					}
				}
			});
			btncarteest4.setBounds(480, 350, 118, 73);
			fenetre.getContentPane().add(btncarteest4);
			
			//CarteSUD*************************************************************
			i = (int)(Math.random() * (higherindex-lowerindex)) + lowerindex;
			couleur = (int)(Math.random() * (highercouleur-lowercouleur)) + lowercouleur;
			carteS = "/"+i+couleur+".gif";
			Carte cartesud1 = new Carte(carteS,carteS);
			scene.setLayout(null);
			CarteButton btncartesud1 = new CarteButton(cartesud1);
			btncartesud1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(carteCentre == null){
						carteCentre = (CarteButton)e.getSource();
					}else{
						carteCentre.setVisible(false);
						carteCentre = (CarteButton)e.getSource();
					}
				}
			});
			btncartesud1.setBounds(200, 500, 73, 97);
			fenetre.getContentPane().add(btncartesud1);
			i = (int)(Math.random() * (higherindex-lowerindex)) + lowerindex;
			couleur = (int)(Math.random() * (highercouleur-lowercouleur)) + lowercouleur;
			carteS = "/"+i+couleur+".gif";
			Carte cartesud2 = new Carte(carteS,carteS);
			scene.setLayout(null);
			CarteButton btncartesud2 = new CarteButton(cartesud2);
			btncartesud2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(carteCentre == null){
						carteCentre = (CarteButton)e.getSource();
					}else{
						carteCentre.setVisible(false);
						carteCentre = (CarteButton)e.getSource();
					}
				}
			});
			btncartesud2.setBounds(250, 500, 73, 97);
			fenetre.getContentPane().add(btncartesud2);
			i = (int)(Math.random() * (higherindex-lowerindex)) + lowerindex;
			couleur = (int)(Math.random() * (highercouleur-lowercouleur)) + lowercouleur;
			carteS = "/"+i+couleur+".gif";
			Carte cartesud3 = new Carte(carteS,carteS);
			scene.setLayout(null);
			CarteButton btncartesud3 = new CarteButton(cartesud3);
			btncartesud3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(carteCentre == null){
						carteCentre = (CarteButton)e.getSource();
					}else{
						carteCentre.setVisible(false);
						carteCentre = (CarteButton)e.getSource();
					}
				}
			});
			btncartesud3.setBounds(300, 500, 73, 97);
			fenetre.getContentPane().add(btncartesud3);
			i = (int)(Math.random() * (higherindex-lowerindex)) + lowerindex;
			couleur = (int)(Math.random() * (highercouleur-lowercouleur)) + lowercouleur;
			carteS = "/"+i+couleur+".gif";
			Carte cartesud4 = new Carte(carteS,carteS);
			scene.setLayout(null);
			CarteButton btncartesud4 = new CarteButton(cartesud4);
			btncartesud4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(carteCentre == null){
						carteCentre = (CarteButton)e.getSource();
					}else{
						carteCentre.setVisible(false);
						carteCentre = (CarteButton)e.getSource();
					}
				}
			});
			btncartesud4.setBounds(350, 500, 73, 97);
			fenetre.getContentPane().add(btncartesud4);
			
			
			fenetre.setVisible(true);
	}
}
