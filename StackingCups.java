import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StackingCups {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        sc.nextLine();
        
        TreeMap<Integer, String> cups = new TreeMap<>();
        
        for (int i = 0; i < n; i++) {
            
            String cupSet = sc.nextLine();

            String[] set = cupSet.split(" ");
            
            try {
                int radius = Integer.parseInt(set[1]);
                String cup = set[0];
                cups.put(radius, cup);
            } catch (NumberFormatException e) {
                int radius = Integer.parseInt(set[0]) / 2;
                String cup = set[1];
                cups.put(radius, cup);
            }
        }

        for (String value : cups.values()) {
            System.out.println(value);
        }
        sc.close();
    }
}

