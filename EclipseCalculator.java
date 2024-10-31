import java.util.Scanner;

public class EclipseCalculator {

    public static int nextEclipse(int d_s, int y_s, int d_m, int y_m) {
        // Initialize t to the first time after now when the sun will be in the correct position
        int t = y_s - d_s;
        
        // Increment t by y_s until we find a time that aligns with both the sun and moon
        while ((t + d_m) % y_m != 0) {
            t += y_s;
        }
        
        return t;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs for sun
        int d_s = scanner.nextInt();
        int y_s = scanner.nextInt();
        
        // Read inputs for moon
        int d_m = scanner.nextInt();
        int y_m = scanner.nextInt();

        // Calculate the number of years until the next eclipse
        int result = nextEclipse(d_s, y_s, d_m, y_m);

        // Output the result
        System.out.println(result);
        
        scanner.close();
    }
}

// import java.util.Scanner;
// public class Eclipse {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int agoSun = sc.nextInt();
//         int untilSun = sc.nextInt();
//         sc.nextLine();
//         int agoMoon = sc.nextInt();
//         int untilMoon = sc.nextInt();
//         sc.close();

//         int cycleSun = untilSun - agoSun;
//         int cycleMoon = untilMoon - agoMoon;

//         int yearsUntil = (cycleMoon * cycleSun) / gcd(cycleSun, cycleMoon);

//         System.out.println(yearsUntil);
//     }

//     public static int gcd(int n1, int n2)
//     {
//         if (n2 != 0)
//             return gcd(n2, n1 % n2);
//         else
//             return n1;
//     }
    
// }


