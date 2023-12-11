import java.util.Scanner;
public class pract4 
{
    public static void main(String[] args) 
    {
        int num1 = 234, num2 = 2341, sum = num1 + num2;
        System.out.print(num1 + " + "+num2 + " = " + sum);




System.out.print("\n\n");
        float nu1 = 12.34f;
        float nu2 = 234.345f;
        float mul = nu1 * nu2;
        System.out.println("\n"+mul);




System.out.print("\n\n");
        char ch = '9';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);




System.out.print("\n\n");        
        char c;
        int asc;
        for(c = 'A'; c <= 'Z'; ++c)
      System.out.print(c + " ");  




      System.out.print("\n\n");
for (char c4 = 'A'; c4 <= 'Z'; c4++)
 {
        System.out.print(c4 + "" + Character.toLowerCase(c4) + " ");
 }




System.out.print("\n\n");      
      char as;
      for(c = '!'; c <= '~'; ++c)
      {
         as = c;
         asc = as;
         System.out.println(c + " = "+ asc + " ");
      }




System.out.print("\n\n");
        int dividend = 25, divisor = 4;
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);




System.out.print("\n\n");
        float first = 1.20f, second = 2.45f;
        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        float temporary = first;
        first = second;
        second = temporary;
        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);




System.out.print("\n\n");
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
     




System.out.print("\n\n");
char ch1 = reader.next().charAt(0);
        if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' )
            System.out.println(ch1 + " is vowel");
        else
            System.out.println(ch1 + " is consonant");




System.out.print("\n\n");
double n1 = -4.5, n2 = -3.9, n3 = -2.5;
if( n1 >= n2 && n1 >= n3)
    System.out.println(n1 + " is the largest number.");

else if (n2 >= n1 && n2 >= n3)
    System.out.println(n2 + " is the largest number.");

else
    System.out.println(n3 + " is the largest number.");





System.out.print("\n\n");
    double a = 2.3, b = 4, c_= 5.6;
    double root1, root2;

    // calculate the determinant (b2 - 4ac)
    double determinant = b * b - 4 * a * c_;

    // check if determinant is greater than 0
    if (determinant > 0) {

      // two real and distinct roots
      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      root2 = (-b - Math.sqrt(determinant)) / (2 * a);

      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
    }

    // check if determinant is equal to 0
    else if (determinant == 0) {

      // two real and equal roots
      // determinant is equal to 0
      // so -b + 0 == -b
      root1 = root2 = -b / (2 * a);
      System.out.format("root1 = root2 = %.2f;", root1);
    }

    // if determinant is less than zero
    else {

      // roots are complex number and distinct
      double real = -b / (2 * a);
      double imaginary = Math.sqrt(-determinant) / (2 * a);
      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
    reader.close();
    }
   }
}
