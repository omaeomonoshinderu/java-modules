package _08_body_part_quiz;

import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {


	private JFrame frame;
	private JPanel panel;
	private BodyPartQuizController controller;

	BodyPartQuiz () {

		controller = new BodyPartQuizController(this);
		
		// Complete the code in the BodyPartQuizModel class.
		
		makeFrame();
	}
	
	public void makeFrame() {

		/* The View consists of 3 Components: a frame, a panel, and a label */

		//    Initialize the frame variable to  "new JFrame()"

		//    Make the frame visible
	
		//    Set the frame's default close operation to JFrame.EXIT_ON_CLOSE

		//    Set the title of the frame

		//    Initialize the panel variable  "new JPanel()"

		//    Add the panel to the frame
		
		
		Dimension dimension = new Dimension(250	,250);
		frame.setPreferredSize(dimension);
		
		// This method adds the label with the picture. Complete the method's code below.
		showNextImage(controller.getNextImage());

		//   Run the program. Do you see a picture? 
		//   Now change the frame's Dimension above so the player can only see half of the face.
		

	}

	public void showNextImage(Icon icon) {

		/* This method removes any existing Components from the panel, 
		 * then it adds the image of the next celebrity */
		
		// remove all the Components from the panel
	
		// create a new JLabel
		
		// set the icon of the label to the one in the parameter
		
		// add the label to the panel
		
		// pack the frame

		/*Complete the code in the BodyPartQuizController class */
		
		
		//  Tell the controller to get the player's guess
		//  for the new image being displayed

	}



}
