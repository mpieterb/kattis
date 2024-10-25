import java.util.Scanner;

public class SquareFence {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long area = sc.nextLong();
        sc.nextLine(); 
        
        double oneSide = Math.sqrt(area);
        double perimeter = oneSide * 4;
        System.out.printf("%.6f\n", perimeter);
        
        sc.close();
    }
}
