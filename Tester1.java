import java.util.*;

public class Tester1 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter # of victims: ");
        String numvic = scan1.nextLine();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter # of vans: ");
        String numvan = scan2.nextLine();

        Chicago chicago = new Chicago(int numvic, int numvan);
            for(int bala = 0; bala < numvan; bala++){
                chicago.kidnappers[bala].move();
            }

        
    }
}
