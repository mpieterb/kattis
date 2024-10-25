import java.util.Scanner;

public class BeatTheSpread {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testCases; i++) {
            float sum = sc.nextInt();
            float dif = sc.nextInt();
            sc.nextLine();
            int final1 = (int) ((sum/2) + (dif/2));
            int final2 = (int) ((sum/2) - (dif/2));

            if (dif > sum) {
                System.out.println("impossible");
            } else if (final1 + final2 != sum) {
                System.out.println("impossible");
            } else {
                System.out.println(String.valueOf(final1) + " " + String.valueOf(final2));
            }
        }
        sc.close();
    }
}
