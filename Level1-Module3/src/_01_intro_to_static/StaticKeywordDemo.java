package _01_intro_to_static;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JSlider;

import game_tools.Game;
import game_tools.GameControlScene;

public class StaticKeywordDemo implements GameControlScene {
    static int WIDTH = 800;
    static int HEIGHT = 600;
    
    Game gameFrame;
    JSlider slider = new JSlider();
    
    public StaticKeywordDemo() {
        gameFrame = new Game("Static Demo");
        gameFrame.setScene(this);
        gameFrame.start();
        gameFrame.setSize(WIDTH, HEIGHT);
        
        GameFrame frame = gameFrame.getFrame();
        frame.add(slider);
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(400, 300, 100, 100);
    }


    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
}
