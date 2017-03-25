package com.jeudecarte.java;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.FlowLayout;



public class Main {

	public static JFrame fenetre;
	public static Scene scene;

	public static CarteButton carteCentre;

	public static void main(String[] args) {

		fenetre = new JFrame("Jeu de Carte");
		scene = new Scene();
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(615, 635);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		fenetre.setContentPane(scene);
		Distribution d = new Distribution(scene, fenetre);

	}	

}


