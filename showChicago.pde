PImage alley;
PImage australia;
PImage street;
PImage streetBend;
public void setup(){
    size(1500,800);
    background(0);
    alley = loadImage("Alley.jpg");
    australia = loadImage("australia.jpg");
    street = loadImage("Street.png");
    streetBend = loadImage("streetBend.png");
}
public void draw(){
    background(0);
    fill(0);
    image(street,-25,75);

}