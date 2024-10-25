import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class emailSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        List<Character> charEmail = new ArrayList<>();
        for (char n : line.toCharArray()) {
            if (n != ' ') {
                charEmail.add(n);
            }
        }

        StringBuilder result = new StringBuilder();
        for (Character ch : charEmail) {
            result.append(ch);
        }
        System.out.println(result.toString());
        sc.close();
    }
}
