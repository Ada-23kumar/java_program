import java.util.Scanner;

public class simple {
    public static void printArray(int arr[]) {
        for ( int i = 0 ;i <arr.length;++i) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        // int a = 10;
        // float b = a;
        // System.out.println(a);
        // System.out.println(b); 
              
        //     float f=10.5f;  
        //     //int a=f;//Compile time error  
        //     int x=(int)f;  
        //     System.out.println(f);  
        //     System.out.println(x);  
        //     int s = 231;
        //     byte d = (byte)s;
        //     System.out.println(s);
        //     System.out.println(d);
        //     int num1 = 102;
        //     int num2 = 102;
        //     byte num3 = (byte)(num1 +num2);
        //     System.out.println(num3);
            int num4 = 10;
            int num5 = 0;
            num5 = ++num4;
            System.out.println("Sum of "+num4);
            System.out.println("element" + num5);


            // get bit
            // get the 3rd bibt(position = 2) of a number n.(n - 0101)
            // bit massk: 1<< i
            // operation: AND
            int n = 5;
            int pos = 2;
            int botMAsk = 1<<pos;
            if((botMAsk & n)==0) {
                System.out.println("bit was zero");
            }else {
                System.out.println("bit was zero");
            }


            // set bit
            // set the 2nd bit(position = 1)of a number n.(n=0101)
            // bit mask: 1<<i
            // operation: OR
            int n1 = 5;
            int pos1 = 2;
            int bitMAsk = 1<<pos1;
            int newNode = bitMAsk|n1;
            System.out.println(newNode);


            // clear Bit
            // set the 3rd bit(position = 2) of a number n.(n = 0101)
            // bit MAsk: 1<<i
            // Operation: AND with NOT

            int n2 = 5;
            int pos2 = 2;
            int bitMask = 1<<pos2;
            int notBitMAsk = ~(bitMask);
            int newMAsk = notBitMAsk & n2;
            System.out.println(notBitMAsk+"   "+"\n"+newMAsk );


            // update bit
            Scanner sc = new Scanner(System.in);
            int oper = sc.nextInt();
            int num = 5;
            int po = 1;
            int bitmask = 1<<po;
            if(oper == 1) {
                int newNuber = bitmask |num;
                System.out.println(newNuber);
            }else {
                int newBitMask = ~(bitmask);
                int newNuber = (newBitMask);
                System.out.println(newNuber);

            }
            sc.close();



            // Bubble sort
            int arr[] = {7,8,3,1,2};
            for(int i =0; i<arr.length;i++) {
                for(int j =0; j<arr.length-i-1; j++){
                    if(arr[j]>arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        printArray(arr);
        System.out.println("\n");


        // selection sort
            for(int i =0; i<arr.length-1; i++) {
                int smallest = i;
                for(int j = i+1; j<arr.length; j++) {
                    if((arr[smallest]>arr[j])){
                        smallest=j;
                    }
                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
            printArray(arr);
            System.out.println("\n");



        // insertion sort
        for(int i = 1; i<arr.length;i++) {
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current< arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
        
        arr[j+1] = current;
        }
    printArray(arr);
    System.out.println("\n");
}
}
