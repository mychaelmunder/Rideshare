PImage alley;
PImage australia;
PImage street;
PImage whiteVan;
public void setup(){
    size(1500,800);
    background(0);
    alley = loadImage("Alley.jpg");
    australia = loadImage("australia.jpg");
    street = loadImage("Street.png");
    whiteVan = loadImage("whitevan.png");
    Chicago chicago = new Chicago(50,20);
    imageMode(CENTER);
}
public void draw(){
    background(0);
    fill(255);
    textSize(16);
    text("mile 0", 10,100);
    text("mile 16", 10,430);
    image(street,600,400);
    image(street,1200,400);
    image(street,600,700);
    image(street,1200,700);
    image(whiteVan, 200, 200);
    for(int bala = 0; bala < 15; bala++){
        image(alley, bala*90 + 125,100);
        image(australia,bala*90 + 125,690);
    }
    image(australia,30,690);


}
