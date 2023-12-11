// package PracticeProgran;
import java.util.*;
public class pract 
{
  int id = 41924;
String name = "Adarsh kumar";
class student
{
    public static void main(String arg[])
    {   
        try (Scanner sc = new Scanner(System.in)) {
          System.out.println("Enter your name: ");
          String name = sc.nextLine();
          System.out.println("Enter your reg.no. : ");
          int reg = sc.nextInt();
          System.out.println("your name: " + name + " your reg.no.: " + reg+"\n");
          // second program
          for (int i=1; i<=100; i++)
          {
              if (i%3==0 && i%5 ==0)
              {
                  System.out.println(i);
              }
          }
          //third program
          System.out.println(" ");
          for(int i=1; i<=5; i++)
          {
            for(int j=1; j<=i; j++)
            {
              System.out.print(j + " ");
            }
          System.out.println(" ");
          } 
          for (int i=1; i<=5; i++)
          {
            for(int j=i; j<=5; j++)
            {
              System.out.print(j + " ");
            }
          System.out.println(" ");
          }
          // froth problem
          int i, n, nextTerm;
          n = 10;
          int t1 = 0 ,t2 = 1;
           System.out.print("0 1");
          for(i = 5; i<n ;i++){
            nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
            System.out.print(" " + nextTerm);
          }
          pract x = new pract();
          System.out.println("\nid\t" + x.id);
          System.out.println("name\t" + x.name);
          // 6th program
          int n1 = 0, n2 = 1, n3, a, count = 10;
          System.out.print(n1 + " "+ n2);
          for(a = 2; a< count; ++a)
          {
            n3 = n1+n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
          } 
          
          
          // 7th problem
          System.out.println("");
          System.out.println("Enter the decimal number: ");
          int dec = sc.nextInt();
          int b1 = 0;
          int rem;
          int rev = 1;
          while(dec>0)
          {
            rem = dec%2;
            dec = dec/2;
            b1 = b1+rem*rev;
            rev = rev*10;
          }
          System.out.println("Binary value of given decimal number : "+ b1);
          sc.close();
        }
      }
      
    }
  }



