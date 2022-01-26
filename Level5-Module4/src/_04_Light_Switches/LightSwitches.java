package _04_Light_Switches;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import game_tools.Game;
import game_tools.GameControlScene;

/*
 * Goal: Use binary operations to create a light show!
 * 
 * Implement the methods below using binary operations.
 * The 'lightsOnOff' variable is an 8-bit bitmap, meaning each bit is like an
 * on/off switch for one of the lights. A binary '1' indicates the light should
 * be on and a binary '0' indicates the light should be off. For example,
 *      bit   7    6    5     4      3     2    1    0
 *          cyan pink black yellow orange red green blue
 * where,
 *      lightsOnOff = 0b01010001    // blue, yellow, and pink are on
 *      lightsOnOff = 0x28          // orange and black are on
 *      lightsOnOff = 65            // green and cyan are on
 * 
 * The code is implemented correctly if the light pattern matches the pattern
 * in the LightSwitches.gif file in this folder.
 */
public class LightSwitches implements GameControlScene {
    static final int DISPLAY_WIDTH = 600;
    static final int DISPLAY_HEIGHT = 150;

    Game gameFrame;
    
    // Changing this array requires changing the code and instructions as well
    Color[] lightColors = {
             Color.BLUE,        // 0
             Color.GREEN,       // 1
             Color.RED,         // 2
             Color.ORANGE,      // 3
             Color.YELLOW,      // 4
             Color.BLACK,       // 5
             Color.PINK,        // 6
             Color.CYAN         // 7
            };

    // 8-bit bitmap. Leave as int so methods won't have to cast to a byte
    volatile int lightsOnOff = 0;

    /*
     * This method should check if the specified light is on, example:
     * index = 6        // return true if pink is on (bit 6 == 1)
     */
    boolean isLightOn(int index) {
        return false;
    }
    
    /*
     * This method should only turn on 1 light, example:
     * index = 4        // turn off yellow only (set bit 4 = 1)
     */
    void turnLightOn(int index) {
        
    }
    
    /*
     * This method should only turn off 1 light
     * index = 0        // turn off blue only (set bit 0 = 0)
     */
    void turnLightOff(int index) {
        
    }
    
    /*
     * This method should be able to turn on multiple lights
     * lightsBitmap = 0b01100110  // lights 1, 2, 5, 6 on
     */
    void turnMultiLightsOn(int lightsBitmap) {
        
    }
    
    /*
     * This method should be able to turn off multiple lights
     * lightsBitmap = 0b10000001  // lights 0, 7 off
     */
    void turnMultiLightsOff(int lightsBitmap) {
        
    }
    
    void runLightSequence1() {
        turnLightOn(0);
        delayMs(200);
        turnLightOff(0);
        turnLightOn(1);
        delayMs(200);
        turnLightOff(1);
        turnLightOn(2);
        delayMs(200);
        turnLightOff(2);
        turnLightOn(3);
        delayMs(200);
        turnLightOff(3);
        turnLightOn(4);
        delayMs(200);
        turnLightOff(4);
        turnLightOn(5);
        delayMs(200);
        turnLightOff(5);
        turnLightOn(6);
        delayMs(200);
        turnLightOff(6);
        turnLightOn(7);
        delayMs(200);
        turnLightOff(7);
    }
    
    void runLightSequence2(){
        turnLightOn(7);
        delayMs(200);
        turnLightOff(7);
        turnLightOn(6);
        delayMs(200);
        turnLightOff(6);
        turnLightOn(5);
        delayMs(200);
        turnLightOff(5);
        turnLightOn(4);
        delayMs(200);
        turnLightOff(4);
        turnLightOn(3);
        delayMs(200);
        turnLightOff(3);
        turnLightOn(2);
        delayMs(200);
        turnLightOff(2);
        turnLightOn(1);
        delayMs(200);
        turnLightOff(1);
        turnLightOn(0);
        delayMs(200);
        turnLightOff(0);
    }
    
    void runLightSequence3(){
        turnMultiLightsOff((1<<8) - 1);
        delayMs(200);
        turnMultiLightsOn(0b00011000);
        delayMs(200);
        turnMultiLightsOff(0b00011000);
        turnMultiLightsOn(0b00100100);
        delayMs(200);
        turnMultiLightsOff(0b00100100);
        turnMultiLightsOn(0b01000010);
        delayMs(200);
        turnMultiLightsOff(0b01000010);
        turnMultiLightsOn(0b10000001);
        delayMs(200);
        turnMultiLightsOff((1<<8) - 1);
    }
    
    public LightSwitches() {
        gameFrame = new Game("Light Switches");
        gameFrame.setScene(this);
        gameFrame.start();
        gameFrame.setSize(DISPLAY_WIDTH, DISPLAY_HEIGHT);
        
        runLightSequence1();
        runLightSequence2();
        runLightSequence3();
    }

    @Override
    public void draw(Graphics g) {
        int x, y, width, height;
        
        for (int i = 0; i < lightColors.length; i++) {
            Graphics2D g2 = (Graphics2D) g;
            width = (DISPLAY_WIDTH - 20) / lightColors.length;
            height = width;
            x = i * width;
            y = 10;

            g2.setStroke(new BasicStroke(3));
            g2.setColor(lightColors[i]);
            
            if (isLightOn(i)) {
                g2.fillOval(x, y, width, height);
            } else {
                g2.drawOval(x, y, width, height);
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }
    
    void delayMs(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gameFrame.getFrame().repaint();
    }
}
