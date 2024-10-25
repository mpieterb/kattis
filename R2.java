import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int R = scanner.nextInt();
        int Average = scanner.nextInt();

        System.out.println(-(R - 2 * Average));
    }
}
