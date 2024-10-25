import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IlluminatedCity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int spots = sc.nextInt();
        int price = sc.nextInt();
        int maxAvgPrice = sc.nextInt();
        ArrayList<Integer> priceLength = new ArrayList();
        boolean avgPriceTooHigh = false;

        for (int i = 0; i < spots; i++){
            int length = sc.nextInt();
            priceLength.add(length * price);
        }
        Collections.sort(priceLength);
        float avgPrice = 0;
        int numLights = 0;

        for (int k = 0; k < spots; k++){
            avgPrice = ((avgPrice*k) + (priceLength.get(k)))/(k+1);
            if (avgPrice > maxAvgPrice) {
                avgPriceTooHigh = true;
                numLights = k;
                break;
            }
        }
        if (avgPriceTooHigh) {
            System.out.println(numLights);
        } else System.out.println(priceLength.size());
    }
}
