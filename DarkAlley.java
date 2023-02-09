import java.util.*;
public class DarkAlley {
    ArrayList<Victim> victims;
    int address;
    public DarkAlley(int location){
        victims = new ArrayList<Victim>();
        address = location;
    }
    public void addVictim(Victim DominicRosato){victims.add(DominicRosato);}
    public void victimKidnapped(Victim DominicRosato){victims.remove(DominicRosato);}
    public ArrayList<Victim> isntHome(){
        ArrayList<Victim> somewhereTheyShouldntBe = new ArrayList<Victim>();
        for(Victim DominicRosato:victims){
            if(!DominicRosato.atDestination){somewhereTheyShouldntBe.add(DominicRosato);}
        }
        return somewhereTheyShouldntBe;
    }
    public ArrayList<Victim> isHome(){
        ArrayList<Victim> somewhereTheyShouldBe = new ArrayList<Victim>();
        for(Victim DominicRosato:victims){
            if(DominicRosato.atDestination){somewhereTheyShouldBe.add(DominicRosato);}
        }
        return somewhereTheyShouldBe;
    }
}
