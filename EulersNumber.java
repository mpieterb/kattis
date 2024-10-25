import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class EulersNumber {

    public static double factorial(int i){    
            if (i == 0)    
              return 1;    
            else    
              return(i * factorial(i-1));    
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        double eulersNumber = 0;

        for (int i = 0; i <= input; i++) {
            eulersNumber += 1.0/factorial(i);
        }
        System.out.println(eulersNumber);
    }
}
