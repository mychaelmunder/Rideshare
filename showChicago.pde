PImage alley;
PImage australia;
PImage street;
PImage whiteVan;
PImage putItInReverse;
int count = 60;
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
        image(alley, bala*92 + 125,100);
        image(australia,bala*92 + 125,690);
    }
    image(australia,30,690);
    boolean inAustralia;
    int vanLocation;
    for(WhiteVan illegalActivities:Chicago.kidnappers){
    if(count == 60){
    count = 0;
      illegalActivities.move();
        if(illegalActivities.location >14){
            inAustralia = true;
            vanLocation = (illegalActivities.location - 15) * 91 + 50;
            }
        else{
            inAustralia = false;
            vanLocation = illegalActivities.location * 92 + 125;
            }
        if(illegalActivities.direction == 1){
            if(inAustralia){
                image(whiteVan,vanLocation,800);
                text(illegalActivities.start,vanLocation - 25, 825);
            }else{
                image(whiteVan,vanLocation,300);
                text(illegalActivities.start,vanLocation - 25, 325);
            }
        }else{
            if(inAustralia){
                image(putItInReverse,vanLocation,600);
                text(illegalActivities.start,vanLocation - 25, 625);
            }else{
                image(putItInReverse,vanLocation,200);
                text(illegalActivities.start,vanLocation - 25, 225);
            }
        }
    }else{
      if(illegalActivities.location >14){
            inAustralia = true;
            vanLocation = (illegalActivities.location - 15) * 91 + 50;
            }
        else{
            inAustralia = false;
            vanLocation = illegalActivities.location * 92 + 125;
            }
        if(illegalActivities.direction == 1){
            vanLocation += + (int)(92/200 * count);
            if(inAustralia){
                image(whiteVan,vanLocation,800);
                text(illegalActivities.start,vanLocation - 25, 825);
            }else{
                image(whiteVan,vanLocation,300);
                text(illegalActivities.start,vanLocation - 25, 325);
            }
        }else{
            vanLocation -= + (int)(92/200 * count);
            if(inAustralia){
                image(putItInReverse,vanLocation,600);
                text(illegalActivities.start,vanLocation - 25, 625);
            }else{
                image(putItInReverse,vanLocation,200);
                text(illegalActivities.start,vanLocation - 25, 225);
            }
        }
    }
      
    
    count++;
}
}