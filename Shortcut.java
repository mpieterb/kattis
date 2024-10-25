import java.util.Scanner;

public class Shortcut {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int input = scanner.nextInt();
            System.out.println((input + 5) * 3 + 10);
        }
    }
}
