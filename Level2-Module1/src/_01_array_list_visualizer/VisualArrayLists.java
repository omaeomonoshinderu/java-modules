package _01_array_list_visualizer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

import _01_array_list_visualizer.data.ArrayList;

public class VisualArrayLists implements ActionListener {
	Timer timer;
	JFrame frame = new JFrame();
	ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		VisualArrayLists vcc = new VisualArrayLists();
		vcc.setup();
	}

	void setup() {
		timer = new Timer(1000 / 60, this);
		timer.start();
		frame.setVisible(true);
		frame.setTitle("LEAGUE ArrayList Visualizer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(list.displayPanel);
		frame.pack();

		list.add("Hi");
		list.add("Moped");
		list.add("Canoe");
		list.add("Taco");
		list.add("John");
		list.add(2, "Spain");
		list.set(1, "Code");
		list.remove(3);
		list.add("Jack");
		list.size();
		list.contains("Coal");
		list.get(3);
		list.clear();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		list.draw();
	}
}
