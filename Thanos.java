import java.util.Scanner;

public class Thanos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int planets = sc.nextInt();

        for (int i = 0; i < planets; i++){
            int population = sc.nextInt(); //population size
            int growthrate = sc.nextInt(); //annual growthrate 
            int foodProduction = sc.nextInt(); //annual food production
            sc.nextLine();

            int yearsRemaining = 0;

            while (population <= foodProduction) {
                population *= growthrate;
                yearsRemaining++;
            }
            System.out.println(yearsRemaining);
        }
    }
}

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
// import java.util.StringTokenizer;
// import java.math.BigInteger;

// public class Thanos {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int planets = Integer.parseInt(br.readLine());

//         for (int i = 0; i < planets; i++) {
//             StringTokenizer st = new StringTokenizer(br.readLine());
//             long population = Long.parseLong(st.nextToken());
//             long growthRate = Long.parseLong(st.nextToken());
//             long foodProduction = Long.parseLong(st.nextToken());

//             if (growthRate == 1) {
//                 // If growth rate is 1, population will never exceed food production unless already larger
//                 if (population <= foodProduction) {
//                     System.out.println("Infinity");
//                 } else {
//                     System.out.println(0);
//                 }
//                 continue;
//             }

//             // Convert values to BigInteger for safe computation
//             BigInteger pop = BigInteger.valueOf(population);
//             BigInteger food = BigInteger.valueOf(foodProduction);
//             BigInteger rate = BigInteger.valueOf(growthRate);

//             int yearsRemaining = 0;

//             // Exponential growth calculation using BigInteger to avoid overflow
//             while (pop.compareTo(food) <= 0) {
//                 pop = pop.multiply(rate);
//                 yearsRemaining++;
//             }

//             System.out.println(yearsRemaining);
//         }
//     }
// }
