package _08_body_part_quiz;

import java.util.ArrayList;

import javax.swing.Icon;

public class BodyPartQuizModel {
	
	
	private ArrayList<BodyPartCelebrity> celebrities = new ArrayList<BodyPartCelebrity>();
	
	private int nextCelebrity = 0;
	

	// 1. Make a private variable to hold the score.

	
	
	public BodyPartQuizModel() {
		/** The quiz has a list of celebrities to identify (see below) **/
		initializeCelebrityList();
	
	}

	private void initializeCelebrityList() {
		
		//2. If you want to change the celebrities in this quiz, you will need to get new images
		//   The images must be placed in the body_part_quiz package before you can use them.
		
		celebrities.add(new BodyPartCelebrity("src/_08_body_part_quiz/arnold.jpeg", "Arnold"));
		celebrities.add(new BodyPartCelebrity("src/_08_body_part_quiz/leonardo.jpeg", "Leonardo"));
		celebrities.add(new BodyPartCelebrity("src/_08_body_part_quiz/morgan.jpeg", "Morgan"));
		celebrities.add(new BodyPartCelebrity("src/_08_body_part_quiz/jack.jpeg", "Jack"));
	}
	
	
	
	private void increaseScore() {
		//3. Increase the score

	}
	
	public int getScore() {
		//4. Return the score

		return 0;
	}
	
	
	 /*      You should not have to change any of the code below here   */
	
	public boolean isCorrectAnswer(String guess) {
	
		 /* Check if the player got the correct answer. 
		  * Adjust the score, if necessary, and set the next question.
		  * Return true if they got it right, false if they did not. */

		Boolean correct = guess.equalsIgnoreCase(celebrities.get(nextCelebrity).getName());
		
		if (correct) {
			increaseScore();
		}
		nextCelebrity++;
		return correct;
	}

	public BodyPartCelebrity getNextCelebrity() {
		if (nextCelebrity < celebrities.size()) {
			return celebrities.get(nextCelebrity);
		}
		return null;
	}

}
