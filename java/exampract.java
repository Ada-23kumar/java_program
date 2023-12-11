// how the class is created 

class c1 {
    int x = 5;//instance variable
    String name = "Adarsh Kumar";
    double sum = 0.0;
    double standardDaviation = 0.0;
    double mean = 0.0;
    double res = 0.0;
    double sq = 0.0;
    double SD(){
        int [] arr = {12, 32, 11, 55, 10, 23, 14, 30};
    int n = arr.length;
    System.out.println("Elements are:");
    for(int i = 0; i<n; i++) {
        System.out.println(arr[i]);
    }
    for(int i = 0; i< n; i++) {
        sum = sum+arr[i];
    }
    mean = sum/(n);
    for(int i = 0; i<n;i++) {
        standardDaviation= standardDaviation+Math.pow(arr[i]-mean,2);
    }
    sq = standardDaviation/n;
    res = Math.sqrt(sq);
    return res;
    }
}
public class exampract {
    int ada = 23;
    String name = "Vicky";
    

   public static void main(String args[]) {
    System.out.println("Hello World!");
    c1 obj = new c1();
    c1 obj1 = new c1();
    System.out.println("Value of x is : "+obj.x);
    System.out.println("Name is : "+obj1.name);
    exampract ex = new exampract();
    System.out.println("Ada's age is: "+ex.ada);
    System.out.println("Name is : "+ex.name);
    String city = "newDelhi, India";
    if(city== "Meerut") {
        System.out.println("You are in Meerut");
    }else if(city== "Noida") {
        System.out.println("You are in Noida");
    }else {
        System.out.println("You are in Delhi not in Meerut or Noida");
    }
    if(city.endsWith("India")) {
        if(city.contains("newDelhi")) {
            System.out.println("you are in new Delhi");
        }else if (city.contains("Meerut")) {
            System.out.println("you are in Meerut");
        }else {
            System.out.println("you are not living in India");
        }
    }
    String[] names = {"Java", "C", "C++", "Python", "JavaScript"};
    System.out.println("Printing the containts of the array names\n");
    for(String name1:names) {
        System.out.println(name1);
    }
    c1 obj2 = new c1();
    double res = obj2.SD();
    System.out.format("Standard Deviation is =%.3f",res);
    System.out.println("\n");
    float f1 = 35e3f;
    double d1 = 12e4d;
    System.out.println(f1);
    System.out.println(d1);
   } 
}
