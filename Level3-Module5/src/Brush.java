
import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;
import processing.core.PImage;

public class Brush {
    PImage painting;
    PApplet processing;
    int paintingIndex;
    int x, y;
    List<Float> bristlesStartX, bristlesStartY, bristlesEndX, bristlesEndY, bristlesRadius;
    
    // These variables affect how the brush is painted
    int brushSize, maxBrushThickness, numberOfBristles, brushStagger;

    public Brush(PApplet processing, PImage painting) {
        this.painting = painting;
        this.processing = processing;
        this.paintingIndex = 0;
        this.x = 0;
        this.y = 0;
        this.brushSize = 40;
        this.maxBrushThickness = 20;
        this.numberOfBristles = 200;
        this.brushStagger = 6;
        this.bristlesStartX = new ArrayList<>();
        this.bristlesStartY = new ArrayList<>();
        this.bristlesEndX = new ArrayList<>();
        this.bristlesEndY = new ArrayList<>();
        this.bristlesRadius = new ArrayList<>();

        initializeBristles();
    }

    public void initializeBristles() {
        for (int i = 0; i < numberOfBristles; i += 1) {
            float bristleX = processing.random(-brushSize, brushSize);
            float bristleY = processing.random(-brushSize, brushSize);
            float bristleRadius = processing.random(maxBrushThickness);
            this.bristlesStartX.add(bristleX);
            this.bristlesStartY.add(bristleY);
            this.bristlesEndX.add(bristleX);
            this.bristlesEndY.add(bristleY);
            this.bristlesRadius.add(bristleRadius);
        }
    }
    
    public void update() {
        x += ((processing.mouseX - x) / brushStagger);
        y += ((processing.mouseY - y) / brushStagger);
        x = PApplet.constrain(x, 0, processing.width);
        y = PApplet.constrain(y, 0, processing.height);
    }

    public void draw() {
        // Must run whether mouse is pressed or not
        // to keep bristle x/y positions up to date
        for (int i = 0; i < numberOfBristles; i++) {
            float x1 = x + bristlesStartX.get(i);
            float y1 = y + bristlesStartY.get(i);

            if (processing.mousePressed) {
                float x2 = bristlesEndX.get(i);
                float y2 = bristlesEndY.get(i);
                float radius = bristlesRadius.get(i);
                float dist = PApplet.dist(x1, y1, x2, y2);
                int pixel = painting.get((int) x2, (int) y2);
                processing.stroke(pixel);

                // The bigger the distance, i.e. the faster the mouse is moved,
                // the bigger and more coarse the line width
                processing.strokeWeight((radius * dist) / 50);

                processing.line(x1, y1, x2, y2);
            }

            bristlesEndX.set(i, x1);
            bristlesEndY.set(i, y1);
        }
    }

    public void setNewPainting(PImage newPainting) {
        this.painting = newPainting;
        processing.getSurface().setSize(newPainting.width, newPainting.height);
        
        // Sets window to move to the upper left corner
        processing.getSurface().setLocation(10, 10);
    }
}
