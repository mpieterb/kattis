import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if (first + second == third) {
            System.out.println(first + "+" + second + "=" + third);
        } else if (first - second == third) {
            System.out.println(first + "-" + second + "=" + third);
        } else if (first / second == third) {
            System.out.println(first + "/" + second + "=" + third);
        } else if (first * second == third) {
            System.out.println(first + "*" + second + "=" + third);
        } else if (first == second + third) {
            System.out.println(first + "=" + second + "+" + third);
        } else if (first == second - third) {
            System.out.println(first + "=" + second + "-" + third);
        } else if (first == second / third) {
            System.out.println(first + "=" + second + "/" + third);
        } else {
            System.out.println(first + "=" + second + "*" + third);
        }
    }
}
