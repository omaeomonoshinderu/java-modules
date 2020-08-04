//    Copyright (c) The League of Amazing Programmers 2013-2020
//    Level 0

package _02_methods._1_animal_farm;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AnimalFarm {
	
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = true;

	
	public static void main(String[] args) {
		new AnimalFarm().animals();
	}
	
	void animals() {

		/* 1. Ask the user which animal they want, then see and hear 
		 *    the animal they chose using one of the methods below.
		*/			 
			
		/* 2. Make it so that the user can keep entering new animals. */

	}

	void moo() {
		playNoise(mooFile);
		showImage(cowImage);
	}

	void quack() {
		playNoise(quackFile);
		showImage(duckImage);
	}

	void woof() {
		playNoise(woofFile);
		showImage(dogImage);
	}
	
	void meow() {
		playNoise(meowFile);
		showImage(catImage);
	}
	
	void llamaScream() {
		playNoise(llamaFile);
		showImage(llamaImage);
	}
	


	

	/* Ignore this stuff */
	String quackFile = "quack.wav";
	String duckImage = "duck.jpg";
	String mooFile = "moo.wav";
	String cowImage = "cow.jpg";
	String woofFile = "woof.wav";
	String dogImage = "dog.jpg";
	String meowFile = "meow.wav";
	String catImage = "cat.jpg";
	String llamaFile = "llama.wav";
	String llamaImage = "llama.jpg";
	
	private void showImage (String imageFile) {
		try {
			ImageIcon animalPic = new ImageIcon("src/_02_methods/_1_animal_farm/"+imageFile);
			JOptionPane.showMessageDialog(null, "", "You chose", 0, animalPic);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "I don't know what that animal looks like");			
		}
		
	}
	
	private void playNoise(String soundFile) {
		if (canPlaySounds) {	
			File sound = new File("src/_02_methods/_1_animal_farm/"+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		}
	}
}