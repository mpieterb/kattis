import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class BookingARoom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int n = sc.nextInt();

        int[] rooms = new int[r];
        int[] booked = new int[n];
        System.out.println(r);
        System.out.println(n);
        System.out.println(rooms);
        
        for (int i = 0; i < n; i++){
            int unavailable = sc.nextInt();
            booked[i] = unavailable;
        }
        Arrays.sort(booked);
        System.out.println(booked);

        for (int j = 0; j < r; j++) {
            if (j )
        }
            

            if (r > n) {
            }
    
    }
}