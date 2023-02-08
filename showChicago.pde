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
    fill(0);
    image(street,600,400);
    image(whiteVan, 200, 200);
    for(int bala = 0; bala < 13; bala++){
        image(alley, bala*85,100);
        image(australia,bala*85,700);
    }


}