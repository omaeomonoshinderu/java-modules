package _08_body_part_quiz;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class BodyPartCelebrity {

	private String imageFile;
	private String name; 


	public BodyPartCelebrity (String imageFile, String name) {
		this.imageFile = imageFile;
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public Icon getIcon() {
		return new ImageIcon(imageFile);
	}
}
