import java.util.Scanner;

public class Filip {


    public int reverse(int number) {
        int reversedNum = 0;
        while (number > 0) {
            reversedNum = reversedNum * 10 + (number % 10);
            number /= 10;
        }
        return reversedNum;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.close();
        
        Filip filip = new Filip();
        
        int revNum1 = filip.reverse(number1);
        int revNum2 = filip.reverse(number2);

        System.out.println(Math.max(revNum1, revNum2));
}
}
