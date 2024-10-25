import java.util.Scanner;

public class LeimMergjad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String target1 = "69";
        String target2 = "420";
        boolean possible = false;


        for (int i = 0; i < str.length(); i++){
            if (str.contains(target1) || str.contains(target2)) {
                possible = true;
            } 
        }
        
        if (possible){
            System.out.println("Mergjad!");
        } else System.out.println("Leim!");
    }
}
