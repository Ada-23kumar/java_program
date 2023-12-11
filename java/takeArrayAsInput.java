import java.util.*;
public class takeArrayAsInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        int [] num = new int[n];
        for(int i =0;i<=num.length;i++) {
            System.out.print((num[i] = sc.nextInt())+" ");
        }
        System.out.println(num);
sc.close();
    }
}
