import java.util.*;
public class WhiteVan {
    ArrayList<Victim> kidnapped;
    int location;
    int start;
    int destination;
    int moneys;
    int direction;
    boolean done;
    public WhiteVan(){
        kidnapped = new ArrayList<Victim>();
        location = (int)(Math.random()*31);
        start = location;
        destination = (int)(Math.random()*31);
        done = false;
        if(location < direction){direction = 1;}
        else{direction = -1;}
    }

    public void move(){
        if(location<destination){location++;} //move the van towards its destination
        else if(location>destination){location++;}
        if(location == destination){ //if the van reaches its destination, drop everyone off
            for(Victim DominicRosato:kidnapped){
                DominicRosato.eject();
                kidnapped.remove(DominicRosato);
                Chicago.theStreets[location].addVictim(DominicRosato);
                done = true;
            }
        }else{
            for(Victim DominicRosato:kidnapped){ //dropping people off if this is their stop
                DominicRosato.gone(location);
                if(location == DominicRosato.destination){
                    DominicRosato.eject();
                    kidnapped.remove(DominicRosato);
                    DominicRosato.welcomeHome();
                }
            
            }
            DarkAlley shadyPlace = Chicago.theStreets[location]; //picking people up if there's space and if they're going the same way
            for(Victim DominicRosato:shadyPlace.victims){
                if(kidnapped.size()<3 && shadyPlace.victims.size()>0){
                    if(!DominicRosato.atDestination){
                        if((start < location && DominicRosato.location < DominicRosato.destination)||(start > location && DominicRosato.location > DominicRosato.destination)){
                            DominicRosato.kidnap();
                            kidnapped.add(DominicRosato);
                            shadyPlace.victimKidnapped(DominicRosato);
                        }
                    }
                }
            }
        }
    }
}
