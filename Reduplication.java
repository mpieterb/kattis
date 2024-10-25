import java.util.Scanner;

public class Reduplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int numChar = scanner.nextInt();
        for (int i = 0; i < numChar; i++) {
            System.out.print(input);
        }
    }
}
