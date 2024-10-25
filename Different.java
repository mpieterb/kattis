import java.math.BigInteger;
import java.util.Scanner;

public class Different {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            while (sc.hasNextLine()) {
                BigInteger firstNum = sc.nextBigInteger();
                BigInteger secondNum = sc.nextBigInteger();
                sc.nextLine();

                BigInteger output = firstNum.subtract(secondNum);
                System.out.println(output.abs());
            }
        }
    }

