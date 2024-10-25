import java.util.Scanner;

public class SodaSlurper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt(); // number of empty soda bottles in Tim’s possession at the start of the day
        int f = sc.nextInt(); // number of empty soda bottles found during the day
        int c = sc.nextInt(); // number of empty bottles required to buy a new soda
        sc.close();
        
        int s = ((e + f) / c);
        int b = s + ((e + f) - (c * ((e + f) / c)));
        
        int result = numSodasDrunk(b, c, s);
        System.out.println(result);
        
    }
    public static int numSodasDrunk(int bottles, int c, int totalSodas){
        if (bottles >= c) { // if bottles are more or equal than costs/bottle
            int sodasBought = bottles / c; 
            int bottlesLeft = bottles - (c * (bottles / c));
            totalSodas += sodasBought; // add amount of sodas you can buy from bottles 
            return numSodasDrunk((sodasBought + bottlesLeft), c, totalSodas); // feed the soda(bottles) you bought plus the rest back into the function
        } else return totalSodas;
    }
}