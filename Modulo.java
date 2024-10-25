import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Modulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> distinctModuloValues = new HashSet<>();

        // Read 10 integers and compute their modulo 42
        for (int i = 0; i < 10; i++) {
            int input = scanner.nextInt();
            int moduloValue = input % 42;
            distinctModuloValues.add(moduloValue);
        }
        System.out.println(distinctModuloValues.size());
        scanner.close();
    }
}