import java.util.Scanner;

public class PerPerPer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cipher = sc.nextLine().toLowerCase();
        String per = "per";
        int days = 0;
        
        for (int i = 0; i < cipher.length(); i++) {
            if (cipher.charAt(i) != per.charAt(i % 3)) {
                days++;
            }
        }
        System.out.println(days);
    }
}
