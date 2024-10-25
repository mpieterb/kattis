// import java.util.Arrays;
// import java.util.Collections;
// import java.util.Scanner;

// public class PizzaParty {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         Integer[] pizzaPrices = new Integer[n];
//         int toBePaid = 0;

//         for (int i = 0; i < n; i++) {
//             sc.next();
//             int price = sc.nextInt();
//             pizzaPrices[i] = price;
//         }
//         Arrays.sort(pizzaPrices, Collections.reverseOrder());

//         for (int i = 0; i < n - 1; i += 2) {
//                 toBePaid += pizzaPrices[i];
//             }

//         if (n % 2 != 0) {
//             toBePaid += pizzaPrices[n - 1];
//         }
//         System.out.println(toBePaid);

//         sc.close();
//     }
    
// }

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the number of pizzas
        int n = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline
        
        // Array to store pizza prices
        Integer[] pizzaPrices = new Integer[n];

        // Reading pizza names and prices
        for (int i = 0; i < n; i++) {
            String pizzaLine = sc.nextLine();
            String[] pizzaData = pizzaLine.split(" ");
            int price = Integer.parseInt(pizzaData[1]); // Extracting the price
            pizzaPrices[i] = price;
        }

        // Sort prices in descending order
        Arrays.sort(pizzaPrices, Collections.reverseOrder());

        int totalCost = 0;

        // Loop through and add only the more expensive pizza in each pair
        for (int i = 0; i < n; i += 2) {
            totalCost += pizzaPrices[i]; // Add the more expensive pizza
        }
        if (n % 2 != 0) {
            totalCost += pizzaPrices[n - 1]; // Add the last pizza
        }

        // Output the minimum price to be paid
        System.out.println(totalCost);

        sc.close();
    }
}