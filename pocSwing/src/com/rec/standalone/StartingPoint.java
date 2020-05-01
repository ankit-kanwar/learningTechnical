package com.rec.standalone;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class StartingPoint {

	static JFrame window;
	static DrawingArea draw;
	static JButton b1, b2;
	static JPanel userInt;
	static JSpinner gravitySpinner;

	public static void main(String[] args) {
		window = new JFrame("Ball");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(600, 400);
		window.setLayout(new BorderLayout());
		

		draw = new DrawingArea();
		window.add(draw, BorderLayout.CENTER);

		userInt = new JPanel();
		window.add(userInt, BorderLayout.NORTH);

		b1 = new JButton("Start");
		b2 = new JButton("aaa");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				draw.setUp();
			}
		});
		userInt.add(b1);
		userInt.add(b2);


		SpinnerNumberModel gravityModel = new SpinnerNumberModel(.9, .1, 2, .1);
		gravitySpinner = new JSpinner(gravityModel);
		userInt.add(gravitySpinner);
		
		window.setVisible(true);
	}
}


class DrawingArea extends JPanel {

	   
	private static final long serialVersionUID = 1L;
	private static final int PREF_W = 600;
	   private static final int PREF_H = 400;

	   public void setUp() {
	      // TODO finish
	   }

	   @Override
	   public Dimension getPreferredSize() {
	      return new Dimension(PREF_W, PREF_H);
	   }

	}