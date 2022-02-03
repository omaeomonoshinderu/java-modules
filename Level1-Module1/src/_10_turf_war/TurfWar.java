package _10_turf_war.TurfWar;

import processing.core.PApplet;

public class TurfWar extends PApplet {
    class Player {
        // 1. Create a constructor for Player that takes all these variables in as
        // parameters and initializes them in order.
        int x;
        int y;
        int speed;
        int playerSize;
        int playerColor;
        int upKey;
        int leftKey;
        int downKey;
        int rightKey;

        // Note: These member variables do not need to be initialized in the constructor
        boolean moveUp = false;
        boolean moveDown = false;
        boolean moveLeft = false;
        boolean moveRight = false;
        int pixelCount = 0;

        void drawPlayer() {
            // 2. Pick a shape and draw the Player using its color, coordinates and size.
            
        }

        void update() {
            // Note: This piece of codes makes the player move up without leaving the bounds
            // of the sketch if its up key is pressed.
            if (moveUp && y > 0) {
                y--;
            }

            // 3. Make the Player move in every other direction.
        }

        // Note: You do not need to change any other Player methods.
        void enableMovement(int keyDown) {
            if (keyDown == upKey) {
                moveUp = true;
            }
            if (keyDown == leftKey) {
                moveLeft = true;
            }
            if (keyDown == downKey) {
                moveDown = true;
            }
            if (keyDown == rightKey) {
                moveRight = true;
            }
        }

        void disableMovement(int keyDown) {
            if (keyDown == upKey) {
                moveUp = false;
            }
            if (keyDown == leftKey) {
                moveLeft = false;
            }
            if (keyDown == downKey) {
                moveDown = false;
            }
            if (keyDown == rightKey) {
                moveRight = false;
            }
        }

        void countPixels() {
            for (int i = 0; i < width * height; i++) {
                if (pixels[i] == playerColor) {
                    pixelCount++;
                }
            }

        }
    }

    // 4. Create two variables of the Player class called player1 and player2. Do
    // not initialize them yet.

    // Note: Do not change these variables
    boolean gameOver = false;
    final int W = 87;
    final int S = 83;
    final int A = 65;
    final int D = 68;

    // Optional: You can change this if you want a shorter or longer game. Right now
    // the game will run for 30 seconds.
    int endOfGame = 30000;
    
    @Override
    public void settings() {
        // 5. Set the size for your sketch.
        
    }

    @Override
    public void setup() {
        // Note: Do not change this code. It makes it so you can press the keys to
        // control the Players without clicking on the window first.
        ((java.awt.Canvas) surface.getNative()).requestFocus();

        // 6. Set the background color.

        // 7. Call the noStroke Method.

        // 8. Initialize the two Player objects. For one use UP, LEFT, DOWN, RIGHT for
        // the keys, for the second use the W,A,S,D int variables created above.
        // Note: Use the Color class for the color, e.g. Color.BLUE.getRGB()
        
    }

    // 9. Uncomment these methods once you have created and initialized player 1 and
    // player 2
//    public void isGameOver() {
//        if (millis() >= endOfGame && !gameOver) {
//            loadPixels();
//            player1.countPixels();
//            player2.countPixels();
//            gameOver = true;
//        }
//    }
//
//    public void endGame() {
//        if (player1.pixelCount == player2.pixelCount) {
//            for (int i = 0; i < width * height; i++) {
//                if (i < (width * height) / 2) {
//                    pixels[i] = player1.playerColor;
//                } else {
//                    pixels[i] = player2.playerColor;
//                }
//            }
//
//        } else if (player1.pixelCount > player2.pixelCount) {
//            println("PLAYER 1 WINS");
//        } else {
//            println("PLAYER 2 WINS");
//        }
//        println((player1.pixelCount / (double) (width * height)) * 100 + "%");
//        println((player2.pixelCount / (double) (width * height)) * 100 + "%");
//        noLoop();
//    }

    @Override
    public void draw() {
        // 10. Call the draw method for both players.

        // 11. Call the update method for both players.

        // 12. Call the isGameOver method.

        // 13. If gameOver is true call the endGame method.

    }

    @Override
    public void keyPressed() {
        // 14. Call the enableMovement method for both players and pass keyCode to the
        // method.
    }

    @Override
    public void keyReleased() {
        // 15. Call the disableMovement method for both players and pass keyCode to the
        // method.
    }

    // 16. Try to play a game of Turf War with someone nearby if possible. The goal
    // of the game is to fill in more of the sketch with your color than the other
    // player.

    // Challenge: Try to add more players to the game. If you need to figure out
    // additional keycodes for controls try using https://keycode.info/

    static public void main(String[] args) {
        PApplet.main(TurfWar.class.getName());
    }
}
