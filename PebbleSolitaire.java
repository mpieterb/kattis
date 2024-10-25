import java.util.Scanner;

public class PebbleSolitaire {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < games; i++) {
            String line = sc.nextLine();
            String[] game = line.split("");
            String[] gameL = game.clone();
            String[] gameR = game.clone();
            int pebblesL = 0;
            int pebblesR = 0;
            
            
            for (int j = 0; j < gameL.length-2; j++) {
                
                if (gameL[j].equals("o") && gameL[j+1].equals("o") && !gameL[j+2].equals("o")) {
                    gameL[j] = "-";
                    gameL[j+1] = "-";
                    gameL[j+2] = "o";
                } 
                if (gameL[j] == gameL[gameL.length - 3] && gameL[gameL.length-1].equals("o") && gameL[gameL.length-2].equals("o") && !gameL[gameL.length-3].equals("o")) {
                    gameL[gameL.length-1] = "-";
                    gameL[gameL.length - 2] = "-";
                    gameL[gameL.length - 3] = "o";
                }
            }

            for (int l = 0; l < gameL.length; l++) {
                if (gameL[l].equals("o")) {
                    pebblesL++;
                }
            }

            for (int j = (gameR.length-1); j > 1; j--) {
                if (gameR[j].equals("o") && gameR[j-1].equals("o") && !gameR[j-2].equals("o")) {
                    gameR[j] = "-";
                    gameR[j-1] = "-";
                    gameR[j-2] = "o";
                } 
                if (gameR[j] == gameR[2] && gameR[gameR.length-1].equals("o") && gameR[gameR.length-2].equals("o") && !gameR[gameR.length-3].equals("o")) {
                    gameR[gameR.length + 1] = "-";
                    gameR[gameR.length + 2] = "-";
                    gameR[gameR.length + 3] = "o";
                }
            }

            for (int l = 0; l < gameR.length; l++) {
                if (gameR[l].equals("o")) {
                    pebblesR++;
                }
            }

            if (pebblesL <= pebblesR) {
                System.out.println(pebblesL);
            } else System.out.println(pebblesR);
        }
    }
}
