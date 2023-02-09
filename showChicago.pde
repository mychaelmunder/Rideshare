PImage alley;
PImage australia;
PImage street;
PImage whiteVan;
PImage putItInReverse;
Chicago chicago = new Chicago(50,25);
public void setup(){
    size(1500,800);
    background(0);
    alley = loadImage("Alley.jpg");
    australia = loadImage("australia.jpg");
    street = loadImage("Street.png");
    whiteVan = loadImage("whitevan.png");
    putItInReverse = loadImage("putItInReverse.png");
    imageMode(CENTER);
}
public void draw(){
    background(0);
    image(street,600,400);
    image(street,1200,400);
    image(street,600,700);
    image(street,1200,700);
    fill(255);
    textSize(16);
    text("mile 0", 10,150);
    text("mile 16", 10,450);
    for(int bala = 0; bala < 15; bala++){
        image(alley, bala*90 + 125,100);
        image(australia,bala*90 + 125,690);
    }
    image(australia,30,690);
    int count = 0;
    boolean inAustralia;
    int vanLocation;
    int vanLocation;
    for(WhiteVan illegalActivities:Chicago.kidnappers){
        if(illegalActivities.location >15){inAustralia = true;}
        else{inAustralia = false;}
        if(illegalActivities.direction == 1){
            
        }
    
    }
    
}
