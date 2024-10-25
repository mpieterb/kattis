import java.util.Scanner;
public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String line = sc.nextLine();
            String lineLower = line.toLowerCase();
            boolean contains = lineLower.contains("problem");

            if (contains) {
                System.out.println("yes");
            } else System.out.println("no");
        }
        sc.close();
    }
}
