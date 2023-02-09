import java.util.*; // tester used throughout to make sure classes were working

public class Tester1 {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter # of vans: ");
        int numvan = scan1.nextInt();

        Chicago chicago = new Chicago(50, numvan);
            for(int bala = 0; bala < numvan; bala++){
                chicago.kidnappers[bala].move();
            }

        
    }
}
