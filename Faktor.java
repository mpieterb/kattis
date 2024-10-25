import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int articles = scanner.nextInt();
            int impact = scanner.nextInt();

            int C = articles * (impact - 1) + 1;

            System.out.print(C);
        }
    }
}
