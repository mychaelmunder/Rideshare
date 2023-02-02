PImage alley;
public void setup(){
    size(1500,800);
    background(255);
    strokeWeight(10);
    line(0,250,1500,250);
    line(0,550,1500,550);
    alley = loadImage("Alley.jpg");
}
public void draw(){
    background(255);
    fill(0);
    stroke(10);
    line(0,250,1500,250);
    line(0,550,1500,550);
    fill(255,255,0);
    for(int bala = 0; bala < 7; bala++){
        quad(100+(bala*200),385, 200+(bala*200), 385, 200+(bala*200),415,100+(bala*200),415);
    }
    for(int bala = 0; bala < 30; bala++){
        image(alley,bala*45,50);
    }
}