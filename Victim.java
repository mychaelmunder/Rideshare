public class Victim{
    int destination;
    int location;
    public Victim(){
        location = (int)(Math.random()*31);
        destination = (int)(Math.random()*31);
    }
    public int getLocation(){return location;}

}