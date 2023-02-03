public class Tester1 {
    public static void main(String[] args) {
        Victim vic1 = new Victim();
        WhiteVan van1 = new WhiteVan();
        WhiteVan van2 = new WhiteVan();
        vic1.getLocation();
        System.out.println("debug");
        System.out.println(vic1.location);
        vic1.isKidnapped();

        Chicago chicago = new Chicago(50,20);
    }
}
