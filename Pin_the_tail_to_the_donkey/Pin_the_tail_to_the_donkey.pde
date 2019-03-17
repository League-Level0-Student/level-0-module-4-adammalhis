PImage donkey;
PImage tail;

void setup() {
  size (1200, 861);
  donkey = loadImage("Donkey.jpg");      
tail = loadImage("Donkey-tail.jpg");      
  
}
void draw() {
  background (donkey);
image(tail, mouseX, mouseY);
  
}