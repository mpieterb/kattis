import java.util.Scanner;
public class Outlets {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt(); 
        sc.nextLine();

        
        for (int i = 0; i < testCases; i++){
            int powerStrips = sc.nextInt();
            int totalOutlets;
            if (powerStrips < 1) {
                totalOutlets = 1;
            } else totalOutlets = -(powerStrips-1);
            
            for (int j = 0; j < powerStrips; j++){
                int outlets = sc.nextInt();
                totalOutlets += outlets;
            }
            sc.nextLine();
            System.out.println(totalOutlets);
        }
        sc.close();
    }
}
