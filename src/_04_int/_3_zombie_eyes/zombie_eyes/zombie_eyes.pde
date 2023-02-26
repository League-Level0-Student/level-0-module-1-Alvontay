
void setup() {
  PImage face = loadImage("images.jpeg");
  size(500,500);
  face.resize(500,500);
  image(face, 0,0);
}
void draw() {
  fill(mouseX/2,mouseY/2,255);
  ellipse(185,265,55,55);
  ellipse(300,265,55,30);
  
 
  fill(0,0,0);
  ellipse(190,260, 25,20);
  ellipse(300,265,25,20);
  
}
