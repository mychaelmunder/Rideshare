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
        if(start < destination){direction = 1;}
        else if(start > destination){direction = -1;}
        else{done = true;}
    }

    public void move(){
        if(location<destination){location++;} //move the van towards its destination
        else if(location>destination){location--;}
        if(location == destination){ //if the van reaches its destination, drop everyone off
            for(int bala = 0; bala<kidnapped.size(); bala++){
                Victim DominicRosato = kidnapped.get(bala);
                DominicRosato.gone(location);
                DominicRosato.eject();
                kidnapped.remove(DominicRosato);
                Chicago.theStreets[location].addVictim(DominicRosato);
                done = true;
            }
        }else{
                for(int bala = 0; bala<kidnapped.size(); bala++){
                    Victim DominicRosato = kidnapped.get(bala); //dropping people off if this is their stop
                DominicRosato.gone(location);
                if(location == DominicRosato.destination){
                    DominicRosato.eject();
                    kidnapped.remove(DominicRosato);
                    DominicRosato.welcomeHome();
                }
            
            }
            DarkAlley shadyPlace = Chicago.theStreets[location-1]; //picking people up if there's space and if they're going the same way
            for(int bala = 0;bala < shadyPlace.victims.size();bala++){
            Victim DominicRosato = shadyPlace.victims.get(bala);
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

