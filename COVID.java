import java.util.Scanner;

public class COVID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.contains("COV")) {
            System.out.print("Veikur!");
        } else {
            System.out.print("Ekki veikur!");
        }
        System.out.println();
    }
}
