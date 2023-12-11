// package com.company;
import java.util.Scanner;
public class take_input 
{
  public static void main(String arg[])
    {
      System.out.println(" My name is Adarsh kumar");
      Scanner ada = new Scanner(System.in);
      
      System.out.println("Enter first number:");
      int a = ada.nextInt();
      System.out.println("Enter the second number:");
      int b = ada.nextInt();
      int sum = a + b;
      System.out.println("The sum of first number and second number is");  
      System.out.println(sum);
      System.out.println("enter the number's of those whome you want to mumtiply and divide\n");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number:");
      int A = sc.nextInt();
      System.out.println("Enter the second number: ");
      int B = sc.nextInt();
      int Mult = A * B;
      System.out.println("multiply of two number's are:");
      System.out.println(Mult);
      System.out.println("Enteer the number for Divive: ");
      System.out.println("Enter the number:");
      int Num = sc.nextInt();
      System.out.println("enter the Second number:");
      int Num1 = sc.nextInt();
      int div = Num/Num1;
      System.out.println(div);
      sc.close();
      ada.close();
    }
    

}
