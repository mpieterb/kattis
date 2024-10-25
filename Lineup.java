import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set; 

/* public class Lineup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int stringLength = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> ASCIIList = new ArrayList<>();
        
        for (int i = 0; i < stringLength; i ++) { // get the ASCII value of each capital letter 
            String name = scanner.nextLine();
            int position = name.charAt(0);
            ASCIIList.add(position);
        }

        String result = checkListOrder(stringLength, ASCIIList);
        System.out.println(result);
    }
        
        
    public static String checkListOrder(int stringLength, ArrayList<Integer> ASCIIList) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
    
        for (int y = 0; y < stringLength - 1; y++) {
            if (ASCIIList.get(y) < ASCIIList.get(y+1)){
                isDecreasing = false;
            }
            if (ASCIIList.get(y) > ASCIIList.get(y+1)){
                isIncreasing = false;
            }
        }

        if (isIncreasing) {
            return "INCREASING";
        } else if (isDecreasing) {
            return "DECREASING";
        } else {
            return "NEITHER";
        }
    }
}
*/

public class Lineup{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int a=Integer.parseInt(in.nextLine());
        ArrayList<String>s1=new ArrayList<String>();
        
        for(int i = 0; i < a; i++){
            String s=in.nextLine();
            s1.add(s);
        }
        
        boolean decreasing=false;
        boolean increasing=false;
        
        for(int j=0;j<s1.size()-1;j++){
            if(s1.get(j).compareTo(s1.get(j+1))<0){
                decreasing=true;
            } else {
                increasing=true;
            }
        }
        
        if(increasing&&decreasing){
            System.out.println("NEITHER");
        } else if(!increasing) {
            System.out.println("INCREASING");
        } else {
            System.out.println("DECREASING");
        }
    }
}
