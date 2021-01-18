package view;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;

import javax.swing.JPanel;
import javax.swing.Timer;

import model.Model;

public class GamePanel extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;

	Timer timer;

	int menuState = 0;
	int instructionState = 1;
	int gameState = 2;
	int endState = 3;
	int currentState = menuState;

	static int score = 0;

	public GamePanel() {

		timer = new Timer(1000 / 60, this);
		timer.start();
	}

	public static void updateScore() {
		score++;
	}

	public void paintComponent(Graphics g) {
		Rectangle rect2 = new Rectangle(100,100);
		Rectangle rect = new Rectangle(100,100);
		rect.setLocation(100,100);
		Graphics2D g2 = (Graphics2D) g;
		rect2.setLocation(100, 100);
		g2.draw(rect);
		g2.fill(rect2);
		System.out.println(Model.testIntersection(rect2, rect));
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}

	

}
