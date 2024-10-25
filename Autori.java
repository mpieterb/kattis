import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names = scanner.nextLine();

        StringBuilder abbreviation = new StringBuilder();

        for (int i = 0; i < names.length(); i++) {
            char currentChar = names.charAt(i);
            if (Character.isUpperCase(currentChar) == true) {
                abbreviation.append(names.charAt(i));
            }
        }
        System.out.println(abbreviation);
    }
}
