import java.util.Scanner;

public class Skener {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int rows = scanner.nextInt();
            int characters = scanner.nextInt();
            int Zr = scanner.nextInt();
            int Zc = scanner.nextInt();
            scanner.nextLine();

            StringBuilder output = new StringBuilder();

            for (int i = 0; i < rows; i++) {
                String line = scanner.nextLine(); // Read the current line

                // Build the expanded version of the line
                StringBuilder expandedLine = new StringBuilder();
                for (int y = 0; y < characters; y++) {
                    char currentChar = line.charAt(y);
                    // Repeat the character Zc times
                    for (int z = 0; z < Zc; z++) {
                        expandedLine.append(currentChar);
                    }
                }

                // Now repeat the expanded line Zr times
                for (int x = 0; x < Zr; x++) {
                    output.append(expandedLine);
                    output.append(System.lineSeparator());
                }
            }

            /*for (int i = 0; i < rows; i++){
                String line = scanner.nextLine();
                for (int y = 0; y < characters; y++) {
                    char currentChar = line.charAt(y);
                    for (int z = 0; z < Zc; z++){
                        output.append(Zc*currentChar);
                        output.append(System.lineSeparator());
                    }
                    for (int x = 1; x < Zr; x++) {
                    } // if Zc value is 0 then no lineseperator
                }
                output.append(System.lineSeparator());
            }  */

            System.out.println(output);
        }
    }
}
