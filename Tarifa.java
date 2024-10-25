import java.util.Scanner;

public class Tarifa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dataPlan = scanner.nextInt();
        int N = scanner.nextInt();
        int unusedData = 0; 
        
        for (int i = 0; i < N; i++) {
            int usage = scanner.nextInt();
            unusedData +=  dataPlan - usage;
        }
        unusedData += dataPlan;
        System.out.println(unusedData);

        scanner.close();

    }
    
}
