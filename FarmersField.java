import java.util.ArrayList;
import java.util.Scanner;

public class FarmersField {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        int r = (scanner.nextInt());
        String[] field = input.split("");
        ArrayList<String> miniField = new ArrayList<>();


        boolean impossible = false;
        
        outerLoop:
        for (int i = 0; i < length; i++) {
            // if (!(new String(field).contains("W"))) {
            //     containsWeeds = true;
            // }

            // if field[i] != 'C', 
                // for each i to array until field[i] == 'C';

                
            if (!"C".equals(field[i])) {
                int start
                while (!"C".equals(field[i])) {
                    for (int j = 0; j < ; j++) {

                        String iString = "";
                        miniField.add(iString);
                    }
                }
            }
        }

        if (impossible) {
            System.out.println("IMPOSSIBLE");
        } else System.out.println("POSSIBLE");

        scanner.close();
    }
}

