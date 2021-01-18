package view;


import java.awt.Dimension;

import javax.swing.JFrame;

public class GameViews extends JFrame{

	GamePanel panel;

	public GameViews(int w, int h, String t) {
		super(t);
		panel = new GamePanel();
		add(panel);
		setPreferredSize(new Dimension(w, h));
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}
}