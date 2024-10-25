
import java.util.Scanner;

public class Moose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();
        sc.close();

        if (l == r && (l > 0 )) {
            System.out.println("Even " + 2*l);
        } else if (l > r) {
            System.out.println("Odd " + 2*l);
        } else if (r > l) {
            System.out.println("Odd " + 2*r);
        } else System.out.println("Not a moose");
    }
}