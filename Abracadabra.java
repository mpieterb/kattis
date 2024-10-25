import java.util.Scanner;

public class Abracadabra {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repetition = scanner.nextInt();

        for (int i = 0; i < repetition; i++) {
            System.out.print(i+1);
            System.out.println(" Abracadabra");
        }
    }
}
