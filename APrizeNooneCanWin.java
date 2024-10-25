import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class APrizeNooneCanWin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();
        int minCost = sc.nextInt();
        sc.nextLine();
        List<Integer> prices = new ArrayList<>();
        int totalItems = 0;

        for (int i = 0; i < items; i++) {
            prices.add(sc.nextInt());
        }
        Collections.sort(prices);

        for (int j = 0; j < prices.size()-1; j++) {
            if (prices.get(j) + prices.get(j+1) <= minCost) {
                totalItems++;
            }
        }

        if (totalItems == items-1 && items > 1) {
            System.out.println(totalItems + 1);
        } else if (items == 1) {            
            System.out.println(totalItems + 1);
        } else System.out.println(totalItems);
    }
}
