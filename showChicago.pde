PImage alley;
PImage australia;
PImage alley25;
PImage alley50;
PImage sideAlley;
PImage australia50;
PImage australia25;
PImage street;
PImage whiteVan;
public void setup(){
    size(1500,800);
    background(0);
    alley = loadImage("Alley.jpg");
    australia = loadImage("australia.jpg");
    alley25 = loadImage("alley25.png");
    alley50 = loadImage("alley50.png");
    sideAlley = loadImage("sideAlley.png");
    australia50 = loadImage("australia50");
    australia25 = loadImage("australia25");
    street = loadImage("Street.png");
    whiteVan = loadImage("whitevan.png");
    Chicago chicago = new Chicago(50,20);
    imageMode(CENTER);
}
public void draw(){
    background(0);
    fill(0);
    image(street,600,400);
    image(whiteVan, 200, 200);
    for(int bala = 0; bala < 13; bala++){
        image(alley, bala*85 + 25,100);
        image(australia,bala*85 + 25,700);
    }
    image(alley25,1150,125);


}