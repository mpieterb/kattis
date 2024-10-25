import java.util.Scanner;

public class SvalurHandsome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numFriends = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        sc.close();

        String[] friends = line.split(" ");

        int mantra = 13;
        String chosenFriend = null;

        if (numFriends < mantra){
            int b = (mantra % numFriends);
            chosenFriend = friends[b - 1];
        } else chosenFriend = friends[mantra-1];

        System.out.println(chosenFriend);
        
    }
}
