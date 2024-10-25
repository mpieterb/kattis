import java.util.Scanner;

public class ReversedBinary {
        // Function converting decimal to binary, reversing it and converting it back to an integer
        static int reverseBinaryToInt(int num) //static beacuse that is also the MAIN method
        {
            StringBuilder binary = new StringBuilder(Integer.toBinaryString(num)); //convert the integer to Binary String
            return Integer.parseInt(binary.reverse().toString(), 2); // Reverse the binary string and turn it into an integer (base 2)
        }

    public static void main(String[] args) { //static like here
        Scanner scanner = new Scanner(System.in);

        int firstInteger = scanner.nextInt();
        scanner.nextLine();

        int newInt = reverseBinaryToInt(firstInteger);

        System.out.println(newInt);

        scanner.close();

    }
}
