import java.util.Scanner;

public class FallingMugs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        sc.close();
        boolean impossible = true;
        
        for(int a = 1; a * a <= D; a++){
            if (D % a == 0) {
                int b = D / a;

                if ((b + a) % 2 == 0 && (b - a) % 2 == 0) {
                    int n2 = (b + a) / 2;
                    int n1 = (b - a) / 2;
                    
                    if(n1 >= 0 && n2 >= 0){
                        System.out.println(n1 + " " + n2);
                        impossible = false;
                        break;
                    }
                }
            }
        }
        if (impossible) {
            System.out.println("impossible");
        }
    }
}
