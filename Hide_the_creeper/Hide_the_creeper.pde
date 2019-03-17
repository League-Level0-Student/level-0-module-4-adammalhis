PImage Jungle;
PImage Creeper;

void setup() {
  size (2048, 1366);
  Jungle = loadImage("Jungle.jpg");
  Creeper = loadImage("creeper.jpg");
  
}

void draw() {
  PImage minecraft = loadImage("jungle.png");    
Jungle.resize(2048, 1366);          
background(Jungle); 
Creeper. resize (10, 10);
image(Creeper, 1150, 275);
  
  
}