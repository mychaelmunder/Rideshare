import java.util.*;
public class WhiteVan {
    ArrayList<Victim> kidnapped;
    int location;
    int start;
    int destination;
    static int moneys = 0;
    int direction;
    boolean done;
    public WhiteVan(){
        kidnapped = new ArrayList<Victim>();
        location = (int)(Math.random()*31);
        start = location;
        destination = (int)(Math.random()*31);
        done = false;
        while(start == destination){destination = (int)(Math.random()*31);}
        if(start < destination){direction = 1;}
        if(start > destination){direction = -1;}
    }

    public void move(){
        moneys+=kidnapped.size();
        if(location<destination){location++;} //move the van towards its destination
        if(location>destination){location--;}
        if(location == destination){ //if the van reaches its destination, drop everyone off
            while(kidnapped.size()!=0){
                Victim DominicRosato = kidnapped.get(0);
                DominicRosato.gone(location);
                Chicago.theStreets[location].addVictim(DominicRosato);
                kidnapped.remove(DominicRosato);
            }
            done = true;
        }else{
                for(int bala = 0; bala<kidnapped.size(); bala++){
                    Victim DominicRosato = kidnapped.get(bala); //dropping people off if this is their stop
                DominicRosato.gone(location);
                if(location == DominicRosato.destination){
                    Chicago.theStreets[location].addVictim(DominicRosato);
                    DominicRosato.welcomeHome();
                    kidnapped.remove(bala);
                    bala--;
                }
            
            }
            DarkAlley shadyPlace = Chicago.theStreets[location]; //picking people up if there's space and if they're going the same way
            for(int bala = 0;bala < shadyPlace.victims.size();bala++){
                if(kidnapped.size()<3 && shadyPlace.victims.size()>0){
                    Victim DominicRosato = shadyPlace.victims.get(bala);
                    if(!DominicRosato.atDestination){
                        if((start < location && DominicRosato.location < DominicRosato.destination)||(start > location && DominicRosato.location > DominicRosato.destination)){
                            kidnapped.add(DominicRosato);
                            shadyPlace.victims.remove(bala);
                            bala--;
                        }
                    }
                }
            }
    }
    }
    public static double averageMoneys(){
        double magicalNumber = moneys/(double)(Chicago.kidnappers.length);
        return magicalNumber;
    }
}

