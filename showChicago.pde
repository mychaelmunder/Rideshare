PImage alley;
PImage australia;
PImage street;
PImage whiteVan;
PImage putItInReverse;
int count = 90;
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
    image(street,850,700);
    image(street,850,400);

    fill(255);
    textSize(16);
    text("mile 0", 10,150);
    text("mile 16", 10,450);
    text("Average revenue: $" + WhiteVan.averageMoneys() + " " + WhiteVan.moneys, 10,20);
    for(int bala = 0; bala < 15; bala++){
        image(alley, bala*90 + 120,100);
        text(Chicago.theStreets[bala].victims.size(),bala*90 +115, 70);
        image(australia,bala*90 + 120,690);
        text(Chicago.theStreets[bala+16].victims.size(),bala*90 +115, 730);
    }
    image(australia,30,690);
    text(Chicago.theStreets[15].victims.size(),25,730);
    boolean inAustralia;
    int vanLocation;
    int total = 0;
    boolean reset = false;
    for(int bala = 0; bala < Chicago.kidnappers.length; bala++){
    WhiteVan illegalActivities = Chicago.kidnappers[bala]; 
    vanLocation = 0;
    if(illegalActivities.done){
        if(illegalActivities.destination >14){
            inAustralia = true;
            vanLocation = (illegalActivities.destination - 15) * 90 + 30;
            }
        else{
            inAustralia = false;
            vanLocation = illegalActivities.destination * 90 + 120;
            }
        if(illegalActivities.direction == 1){
            if(inAustralia){
                image(whiteVan,vanLocation,600);
                text("done",vanLocation - 25, 625);
            }else{
                image(whiteVan,vanLocation,300);
                text("done",vanLocation - 25, 325);
            }
        }else{
            if(inAustralia){
                image(putItInReverse,vanLocation,500);
                text("done",vanLocation - 25, 525);
            }else{
                image(putItInReverse,vanLocation,200);
                text("done",vanLocation - 25, 225);
            }
        }
    }else{
        if(count == 90){
        reset = true;
        illegalActivities.move();
        }else{
            if(illegalActivities.direction == 1){vanLocation +=count;}
            else{vanLocation -=count;}
        }
        if(illegalActivities.location >14){
            inAustralia = true;
            vanLocation = vanLocation + (illegalActivities.location - 15) * 90 + 55;
            }
        else{
            inAustralia = false;
            vanLocation = vanLocation + illegalActivities.location * 90 + 110;
            }
        if(illegalActivities.direction == 1){
            if(inAustralia){
                image(whiteVan,vanLocation,600);
                text(illegalActivities.location,vanLocation - 25, 625);
                text(illegalActivities.destination,vanLocation + 25, 625);
                text(illegalActivities.kidnapped.size(),vanLocation, 600);
            }else{
                image(whiteVan,vanLocation,300);
                text(illegalActivities.location,vanLocation - 25, 325);
                text(illegalActivities.destination,vanLocation + 25, 325);
                text(illegalActivities.kidnapped.size(),vanLocation, 300);
            }
        }else{
            if(inAustralia){
                image(putItInReverse,vanLocation,500);
                text(illegalActivities.location,vanLocation - 25, 525);
                text(illegalActivities.destination,vanLocation + 25, 525);
                text(illegalActivities.kidnapped.size(),vanLocation, 500);
            }else{
                image(putItInReverse,vanLocation,200);
                text(illegalActivities.location,vanLocation - 25, 225);
                text(illegalActivities.destination,vanLocation + 25, 225);
                text(illegalActivities.kidnapped.size(),vanLocation, 200);
            }
        }
    }  
    text(illegalActivities.location,total * 40, 425);
    text(vanLocation, total * 40, 400);
    total++;
}
count++;
if(reset){count = 0;}
}
