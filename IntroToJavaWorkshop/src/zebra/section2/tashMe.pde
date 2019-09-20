PImage mustache;
PImage face;

// 1. Find a picture of a face on the internet.
// 2. Right-click on the file and use "Save As" to save it on your desktop
// 3. Rename your image something short (e.g. "face")
// 4. Drag the image from your desktop and drop it into your code

void setup(){
  // 5. On the line below, change "noFace.jpg" to match your file name
  face = loadImage("noFace.jpg");
  size(600, 600);
  face.resize(width,height);
  
  // 6. load the mustache image like this: mustache = loadImage("mustache.png");

}


void draw() {
  background(face);
  // 7. draw your mustache like this: image(mustache, 400, 300);
  
  // 8. Change the previous line of code so that the mustache moves with your mouse!
  
  // 9. Use an if statement to make the mustache appear only when the mouse is pressed. 
  
  // EXTRA CREDIT
  // Resize your mustache so that it fits better using: mustache.resize(int width, int height) 
  
  // EXTRA CREDIT
  // Go find your own mustache on the internet. 
  // Make sure it has a transparent background!  Search for “mustache transparent” 
}
