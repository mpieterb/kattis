import java.util.Scanner;

public class Howl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ferirsHowl = scanner.nextLine();

        String myHowl = new String("AWAWHOO");
        String myO = new String("O");

        if (myHowl.length() <= ferirsHowl.length()){
            String newO = new String(myO.repeat(ferirsHowl.length()-myHowl.length()+1));
            String newHowl = myHowl + newO;
            System.out.println(newHowl);
        } else {
            System.out.println(myHowl);
        }
    }
}
