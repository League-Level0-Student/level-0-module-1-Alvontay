PImage pepperoni;
PImage olive;
PImage mushroom;


void setup() {
  
  pepperoni = loadImage("pepperoni.png");
  olive = loadImage("olive.png");
  mushroom = loadImage("mushroom.png");

  olive.resize(30,30);
  pepperoni.resize(300,300);
  mushroom.resize(10,10);
      
   size(500,500);
   fill(#CBAF50);
   ellipse(250,250,450,450);
   fill(#FF0000);
   ellipse(250,250,400,400);
   fill(#FFCD00);
   ellipse(250,250,350,350);
}

void draw() {
  if(mousePressed && mouseButton == LEFT) {
    image(pepperoni,mouseX,mouseY);
  }
  if(mousePressed && mouseButton == RIGHT) {
    image(olive,mouseX,mouseY);
  }
  if (mousePressed && mouseButton == CENTER) {
    image(mushroom,mouseX,mouseY);
  }
}
