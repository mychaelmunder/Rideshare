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
    for(WhiteVan illegalActivities:Chicago.kidnappers){
       vanLocation = 0;
      inAustralia = false;
      if(illegalActivities.location <=15){vanLocation = illegalActivities.location * 85 + 50; inAustralia = false;}
      else if(illegalActivities.location > 15){vanLocation = (illegalActivities.location - 15) * 85 + 50; inAustralia = true;}
      if(illegalActivities.direction == -1){
        if(inAustralia){image(whiteVan,vanLocation,800); text(illegalActivities.location, vanLocation, 825);text(illegalActivities.direction,vanLocation,800); text(illegalActivities.destination,vanLocation + 25,825);}
        else{image(whiteVan,vanLocation,500);text(illegalActivities.location, vanLocation, 525); text(illegalActivities.direction,vanLocation,500);text(illegalActivities.destination,vanLocation + 25,525);}
    }else{
       if(inAustralia){image(putItInReverse,vanLocation,600); text(illegalActivities.location, vanLocation, 625);text(illegalActivities.direction,vanLocation,600);text(illegalActivities.destination,vanLocation + 25,625);}
         else{image(putItInReverse,vanLocation,300); text(illegalActivities.location, vanLocation, 325);text(illegalActivities.direction,vanLocation,300);text(illegalActivities.destination,vanLocation + 25,325);}
    }
    }
    
}
