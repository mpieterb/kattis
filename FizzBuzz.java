import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % X == 0 && i %Y != 00) {
                System.out.println("Fizz");
            } else if (i % X != 0 && i % Y == 0) {
                System.out.println("Buzz");
            } else if (i % X == 0 && i % Y == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
