import java.util.ArrayList;
import java.util.Scanner;

public class BabyBites {
    /*
     * public static void main(String[] args) {
     * Scanner scanner = new Scanner(System.in);
     * ArrayList<String> bites = new ArrayList<>();
     * 
     * int numBites = scanner.nextInt();
     * 
     * while(scanner.hasNext()){
     * String bite = scanner.next();
     * bites.add(bite);
     * System.out.println(bites);
     * System.out.println(bites.size());
     * if (!scanner.hasNext()) {
     * scanner.close();
     * break;
     * }
     * }
     * 
     * if (bites.size() == numBites) {
     * System.out.println("makes sense");
     * } else {
     * System.out.println("something is fishy");
     * }
     * // Optionally print the entered bites for debugging
     * System.out.println("Bites entered: " + bites);
     * }
     * }
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of bites Arild is supposed to receive
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Read the words spoken by Arild
        String[] spokenWords = scanner.nextLine().split(" ");

        boolean makesSense = true;

        // Check each word
        for (int i = 0; i < n; i++) {
            String word = spokenWords[i];

            // If the word is "mumble", skip it as it might be any number
            if (!word.equals("mumble")) {
                // Parse the word as an integer and check if it matches the expected count (i +
                // 1)
                int count = Integer.parseInt(word);
                if (count != i + 1) {
                    makesSense = false;
                    break;
                }
            }
        }

        // Print the result
        if (makesSense) {
            System.out.println("makes sense");
        } else {
            System.out.println("something is fishy");
        }

        scanner.close();
    }
}