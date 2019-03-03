int x=100;
int y=50;
void setup() {
  PImage face = loadImage("27-spongebob-squarepants.w700.h700-1.jpg");
  background (face); 
  
size(700, 700);
face.resize(width,height);


}
  void draw() {
  fill (255,255,255);
    ellipse (400, 280, 90, 90);
  ellipse (350, 250, 90, 90);
   
  
  
  
  
  
  
  if (Math.sqrt(Math.pow(mouseX-350,2)+Math.pow(mouseY-250,2)) < 22.5) {
     x=mouseX;    
     y=mouseY;
  }
    if (Math.sqrt(Math.pow(x-350,2)+Math.pow(y-250,2)) < 22.5) {
   fill (0, 0, 0); 
ellipse (x+50, y+30, 45, 45);
  ellipse (x, y, 45, 45);
    }
     
  
}
