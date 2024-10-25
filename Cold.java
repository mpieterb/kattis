import java.util.Scanner;

public class Cold {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTemp = scanner.nextInt();
        int numBelowZero = 0;

        for (int i = 0; i < numTemp; i++) {
            int temperature = scanner.nextInt();
            if (temperature < 0) {
                numBelowZero++;
            }
        }
        System.out.println(numBelowZero); 
    }
}
