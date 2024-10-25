
import java.util.Scanner;

public class Storafmaeli {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age % 10 == 0) {
            System.out.println("Jebb");
        } else {
            System.out.println("Neibb");
        }

        scanner.close();
    }
}