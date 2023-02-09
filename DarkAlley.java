import java.util.*;
public class DarkAlley { // stations class
    ArrayList<Victim> victims;
    int address; // all stations addressed as an int
    public DarkAlley(int location){
        victims = new ArrayList<Victim>();
        address = location;
    }
    public void addVictim(Victim DominicRosato){victims.add(DominicRosato);} // put a victim into station
    public void victimKidnapped(Victim DominicRosato){victims.remove(DominicRosato);} // take victim out
    public ArrayList<Victim> isntHome(){ // if the victim isnt at the destination begin moving
        ArrayList<Victim> somewhereTheyShouldntBe = new ArrayList<Victim>();
        for(Victim DominicRosato:victims){
            if(!DominicRosato.atDestination){somewhereTheyShouldntBe.add(DominicRosato);}
        }
        return somewhereTheyShouldntBe; // ! destination
    }
    public ArrayList<Victim> isHome(){ // if victim is at destination add
        ArrayList<Victim> somewhereTheyShouldBe = new ArrayList<Victim>();
        for(Victim DominicRosato:victims){
            if(DominicRosato.atDestination){somewhereTheyShouldBe.add(DominicRosato);}
        }
        return somewhereTheyShouldBe; // destination
    }
}
