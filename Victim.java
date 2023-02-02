public class Victim{
    int destination;
    int location;
    int start;
    boolean isKidnapped;
    boolean atDestination;
    public Victim(){
        location = (int)(Math.random()*31);
        start = location;
        destination = (int)(Math.random()*31);
        isKidnapped = false;
        atDestination = false;
    }
    public int getLocation(){return location;}
    public int getDestination(){return destination;}
    public boolean isKidnapped(){return isKidnapped;}
    public void kidnap(){isKidnapped = true;}
    public void eject(){isKidnapped = false;}
    public void gone(int newLocation){location = newLocation;}
    public void welcomeHome(){atDestination = true;}
}