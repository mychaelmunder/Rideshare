import java.util.*;

public class Tester1 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter # of victims: ");
        int numvic = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter # of vans: ");
        int numvan = scan2.nextInt();

        Chicago chicago = new Chicago(numvic, numvan);
            for(int bala = 0; bala < numvan; bala++){
                chicago.kidnappers[bala].move();
            }

        
    }
}
