import java.util.Scanner;
import java.util.TreeMap;

public class TransactionFee {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            TreeMap<Integer, String> transactionFee = new TreeMap<>();
            String[] providers = {"Monnei", "Fjee", "Dolladollabilljoll"};

            for (int i = 0; i < 3; i++) {
                transactionFee.put(sc.nextInt(), providers[i]);
            }       
            System.out.println(transactionFee.get(transactionFee.firstKey()));
        }
    }
}

