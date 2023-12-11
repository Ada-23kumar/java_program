import java.util.*;
class solution {
    public int convertFive(int n){
    String numStr = Integer.toString(n);
        
        // Replace all '0' characters with '5'
        numStr = numStr.replace('0', '5');
        
        // Parse the modified string back to an integer
        int result = Integer.parseInt(numStr);
        
        return result;
    }
}
public class learn {
    public static void main (String[] args){
        System.out.println("Enter elemnts");
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt();
            solution g = new solution();
            System.out.println(g.convertFive(n));
        }
        sc.close();
    }
}
