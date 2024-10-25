import java.util.Scanner;

public class SecondsToHours {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        int minutes;
        int seconds;

        int hours = input / 3600;
        minutes = (input % 3600) / 60;

        if (minutes > 0 || hours > 0) {
            seconds = ((input - (3600 * hours)) % 60);
        } else {
            seconds = input;
        }

        System.out.println(hours + " : " + minutes + " : " + seconds);

    }
}
