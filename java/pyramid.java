import java.util.*;
public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        System.out.println("Enter rows");
        n  = sc.nextInt();
        System.out.println("Enter colum");
        m = sc.nextInt();


        System.out.println("\nThis is for printing a pattern which is a rectangle\n");
        for(int i =1; i<=n; i++) {
            for(int j = 1; j<=m; j++){
                System.out.print(" `<'^_^'>` ");
            }
            System.out.println();
        }



        System.out.println("This is for printing a pattern which is a outer rectangle Pyramid number");
        System.out.println("Enter rows");
        n  = sc.nextInt();
        System.out.println("Enter colum");
        m = sc.nextInt();
        for(int i =1; i<=n;i++){
            for(int j=1;j<=m; j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print(" .!^_^!. ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



        System.out.println("This is for printing a pattern for increasing * or half Pyramid number");
        System.out.println("Enter rows");
        n  = sc.nextInt();
        for(int i= 1; i<=n; i++)
        {
            for(int j =1; j<=i; j++)
            {
                System.out.print(" ~(-^-)~ ");

            }
            System.out.println();
        }

        System.out.println("This is  for printing a  pattern for decreasing * Pyramid number");
        System.out.println("Enter rows");
        n  = sc.nextInt();
        for(int i =n;i>=1;i--){
            for(int j = i; j>=1; j--) {
                System.out.print(" -{^_^}- ");
            }
            System.out.println();
        }



        System.out.println("This is  for printing a  pattern for decreasing * Pyramid number");
        System.out.println("Enter rows");
        n  = sc.nextInt();
        for(int i =1; i<=n;i++) {
            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++) {
                System.out.print(" `(^_^)` ");
            }
            System.out.println();
        }



        System.out.println("This is fro printing a pattern for print increasing number Pyramid number");
        System.out.println("Enter a number");
        n = sc.nextInt();
        for(int i = 1; i<=n;i++) {
            for (int j =1; j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }




        System.out.println("Inverted half with Pyramid number");
        System.out.println("Enter a number");
        n = sc.nextInt();
        for(int i = n; i>=1;i--) {
            for(int j = i;j>=1;j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }



        System.out.println("Inverted half with Pyramid number");
        System.out.println("Enter a number");
        n = sc.nextInt();
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("Inverted half with Pyramid number");
        System.out.println("Enter a number");
        n = sc.nextInt();
        int x = 1;
        for(int i = 1; i<=n;i++) {
            for(int j = 1; j<=i; j++)  {
                System.out.print(x+" ");
                        x++;
            }
            System.out.println();
        }



        System.out.println("Inverted half with Pyramid number");
        System.out.println("Enter a number");
        n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j =1; j<=i;j++) {
                int sum = i+j;
                if(sum%2==0) {
                    System.out.print(" 1 ");
                }else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
sc.close();
    }
}
