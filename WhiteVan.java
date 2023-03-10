import java.util.*;
public class WhiteVan { // car class
    ArrayList<Victim> kidnapped; // utilize arraylist of passengers 
    int location;
    int destination;
    static int moneys = 0; // static var money 
    int direction; // left or right for processing
    boolean done;
    public WhiteVan(){
        kidnapped = new ArrayList<Victim>();
        location = (int)(Math.random()*31);
        destination = (int)(Math.random()*31);
        done = false;
        while(Math.abs(location - destination) < 3){destination = (int)(Math.random()*31);}//makes the vans have a minimum travel distance
        if(location < destination){direction = 1;}
        if(location > destination){direction = -1;}
    }

    public void move(){
        moneys+=kidnapped.size();
        if(location<destination){location++;} //move the van towards its destination
        if(location>destination){location--;}
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
        if(location == destination){ //if the van reaches its destination, drop everyone off
            while(kidnapped.size()!=0){
                Victim DominicRosato = kidnapped.get(0);
                DominicRosato.gone(location);
                Chicago.theStreets[location].addVictim(DominicRosato);
                kidnapped.remove(0);
            }
            done = true;
        }else{
            DarkAlley shadyPlace = Chicago.theStreets[location]; //picking people up if there's space and if they're going the same way
            for(int bala = 0;bala < shadyPlace.victims.size();bala++){
                if(kidnapped.size()<3 && shadyPlace.victims.size()>0){
                    Victim DominicRosato = shadyPlace.victims.get(bala);
                    if(!DominicRosato.atDestination){
                        if((direction == 1 && DominicRosato.location < DominicRosato.destination)||(direction == -1 && DominicRosato.location > DominicRosato.destination)){
                            kidnapped.add(DominicRosato);
                            shadyPlace.victims.remove(bala);
                            bala--;
                        }
                    }
                }
            }
    }
    }
    public static double averageMoneys(){ // get average $$$
        double magicalNumber = moneys/(double)(Chicago.kidnappers.length);
        return magicalNumber;
    }
}

