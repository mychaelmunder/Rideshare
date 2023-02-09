public class Victim{ //passenger class tracking start location, current loc, and goal destination
    int destination;
    int location;
    int start;
    boolean isKidnapped;
    boolean atDestination;
    public Victim(){
        location = (int)(Math.random()*31); //random var from 0-30
        destination = (int)(Math.random()*31); // same as above
        isKidnapped = false; // in van set to false
        atDestination = false; // at destination set to false
        while(location == destination){destination = (int)(Math.random()*31);} // failsafe for if loc = dest
        start = location;
    }
    public int getLocation(){return location;} // getters
    public int getDestination(){return destination;}
    public boolean isKidnapped(){return isKidnapped;}
    public void gone(int newLocation){location = newLocation;} // new loc replaced with current
    public void welcomeHome(){atDestination = true;} // arrival 
}
