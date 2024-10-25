import java.util.Scanner;

public class Signature {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String name = "";
            while (name.length() >= 100 || name.length() < 1) {
                System.out.println("Enter your name: ");
                name = scanner.nextLine();
                if (name.length() > 100) {
                    System.out.println("This doesn't work...");
                } else if (name.isEmpty()) {
                    System.out.println("This doesn't work...");
                }
            }

            System.out.println("");
            System.out.println("Kvedja,");
            System.out.println(name);
        }
    }
}
