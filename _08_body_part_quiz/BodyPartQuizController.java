package _08_body_part_quiz;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class BodyPartQuizController {

	private BodyPartQuizModel model;
	private BodyPartQuiz view;
	
	BodyPartQuizController(BodyPartQuiz view) {
		
		/* The controller acts as the go-between so needs needs a view and model */
		
		this.view = view;
		model = new BodyPartQuizModel();
	}
	
	
	public void getPlayerGuess() {	
	
		String guess = JOptionPane.showInputDialog("who is this?");

			//  Send the answer to the model for checking.
		
			//  If they guessed correctly -- tell them they are right

			//  Otherwise -- tell them they are wrong 

			//  Now tell the view to show the next celebrity. 
			//  You will need to use the method below to get the next image from the model

	}
	
	
	
	/* This method will get the picture of the next celebrity. 
	 * You should not have to change this code.
	 */
	public Icon getNextImage() {
		Icon next = model.getNextCelebrity().getIcon();
		
		if (next == null) {
			
			// Change the message dialog to include the player's score 			
			JOptionPane.showMessageDialog(null, "Game Over");

			System.exit(0);
		} 
		return next;	
	}
	
}
