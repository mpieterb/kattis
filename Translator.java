import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Translator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sentenceLength = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] toTranslate = str.split(" ");
        
        int dicSize = sc.nextInt();
        sc.nextLine();

        Map<String, String> dictionary = new TreeMap<>();

        for (int i = 0; i < dicSize; i++) {
            dictionary.put(sc.next(), sc.next());
        }
        sc.close();

        for (int i = 0; i < sentenceLength; i++) {
            // Check if the word exists in the dictionary, and if so, replace it
            if (dictionary.containsKey(toTranslate[i])) {
                toTranslate[i] = dictionary.get(toTranslate[i]);
            }
        }
        // for (int i = 0; i < sentenceLength; i++) { THIS CODE IS WRONG (INEFFICIENT)
        //     for (Map.Entry<String,String> entry : dictionary.entrySet()) {
        //         if (toTranslate[i].equals(entry.getKey())) {
        //             toTranslate[i] = entry.getValue();
        //         }
        //     }
        // }

        for (int i = 0; i < sentenceLength; i++) {
            if (sentenceLength - i == 1) {
                System.out.println(toTranslate[i]);
            } else System.out.print(toTranslate[i] + " ");
        }
    }
}
