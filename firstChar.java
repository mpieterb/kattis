import java.util.Scanner;

public class firstChar {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            char firstChar = input.charAt(0);
            System.out.println(firstChar);
        }
    }

}
