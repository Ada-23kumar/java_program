import java.util.Scanner;
public class introduction_java {
    public static void main(String arg[])
    {
        System.out.println("Hello World!");
        System.out.println("My name is Adarsh kumar");
        System.out.print("Hello World");
        System.out.println("*");
        System.out.println("**"); 
        System.out.println("***");
        String name = "Adarsh Kumar";
        int num = 3432;
        double price = 2314;
        System.out.println(name);
        System.out.println(num);
        System.out.println(price);
       try (// float decimal = 123.456;
               // input  
    Scanner sc = new Scanner(System.in))
     {
           int number = sc.nextInt();
           System.out.println("The number you are Enter:");
           System.out.println(number);
     }
    }

}

