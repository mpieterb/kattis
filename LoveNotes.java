import java.util.Scanner;

public class LoveNotes {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNotes = sc.nextInt();
        sc.nextLine();

        StringBuilder notes = new StringBuilder();

        for (int i = 0; i < numNotes; i++) {
            String note = sc.nextLine();
            notes.append(note);
        }
        notes.reverse();

        System.out.println(notes);
        ;
    }
}
