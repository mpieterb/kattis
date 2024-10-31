import java.util.Scanner;
public class Eclipse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int agoSun = sc.nextInt();
        int untilSun = sc.nextInt();
        sc.nextLine();
        int agoMoon = sc.nextInt();
        int untilMoon = sc.nextInt();
        sc.close();

        int cycleSun = untilSun - agoSun;
        int cycleMoon = untilMoon - agoMoon;

        int yearsUntil = (cycleMoon * cycleSun) / gcd(cycleSun, cycleMoon);

        System.out.println(yearsUntil);
    }

    public static int gcd(int n1, int n2)
    {
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
    }
    
}
