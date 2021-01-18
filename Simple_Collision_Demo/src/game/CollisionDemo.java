package game;

import model.Model;
import view.GameViews;

public class CollisionDemo {
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	
	public static void main(String[] args) {
		new CollisionDemo().start();
	}
	
	public void start(){
		GameViews view = new GameViews(WIDTH, HEIGHT, "League Invaders");
		Model model = new Model();
		
		
	}
	
	
}
