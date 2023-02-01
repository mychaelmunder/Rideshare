import java.util.*;
public class WhiteVan {
    ArrayList<Victim> kidnapped;
    int location;
    int destination;
    int moneys;
    public WhiteVan(){
        kidnapped = new ArrayList<Victim>();
        location = (int)Math.random()*31;
        destination = (int)Math.random()*31;
    }
}
