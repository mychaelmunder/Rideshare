public class Tester1 {
    public static void main(String[] args) {
        Victim vic1 = new Victim();
        WhiteVan van1 = new WhiteVan();
        WhiteVan van2 = new WhiteVan();
        System.out.println(vic1.getLocation());
        System.out.println(vic1.isKidnapped());

        Chicago chicago = new Chicago(50,20);
    }
}
