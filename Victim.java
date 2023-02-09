public class Victim{
    int destination;
    int location;
    int start;
    boolean isKidnapped;
    boolean atDestination;
    public Victim(){
        location = (int)(Math.random()*31);
        destination = (int)(Math.random()*31);
        isKidnapped = false;
        atDestination = false;
        while(location == destination){destination = (int)(Math.random()*31);}
        start = location;
    }
    public int getLocation(){return location;}
    public int getDestination(){return destination;}
    public boolean isKidnapped(){return isKidnapped;}
    public void gone(int newLocation){location = newLocation;}
    public void welcomeHome(){atDestination = true;}
}