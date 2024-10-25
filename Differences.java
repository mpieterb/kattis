import java.util.Scanner;

public class Differences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        StringBuilder output = new StringBuilder();
        
        int numOfTestCases = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < numOfTestCases; i++) {
            String firstOfLines = scanner.nextLine();
            String secondOfLines = scanner.nextLine();
            output.append(firstOfLines).append(System.lineSeparator());
            output.append(secondOfLines).append(System.lineSeparator());
            for (int y = 0; y < firstOfLines.length(); y++){
                if (firstOfLines.charAt(y) == secondOfLines.charAt(y)) {
                    output.append(".");
                } else {
                    output.append("*");
                    
                }
            }
            output.append(System.lineSeparator());
        }
        
        System.out.println(output);
    }
}
