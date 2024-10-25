import java.util.Scanner;

public class EarlyWinter {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int current = scanner.nextInt();
    String nothing = scanner.nextLine();
    int yearsAgo;
    boolean sometime = false;

    for(
    int i = 0;i<n;i++)
    {
        int previousYear = scanner.nextInt();
        if (current >= previousYear) {
            yearsAgo = i;
            sometime = true;
        }
    }if(!sometime)
    {
        System.out.println("It had never snowed this early!");
    }else
    {
        System.out.println("It hadn't snowed this early in " + yearsAgo + " years!");
    }
}
