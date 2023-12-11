import java.util.Scanner;

class SubarrayGenerator {
    // Method to print all non-empty subarrays of an array
    void printSubarrays(int[] arr) {
        int n = arr.length;

        // Generate all subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println(); // Move to the next line after printing each subarray
            }
        }
    }
}

public class subarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        // Declare an array of size n
        int[] arr = new int[n];

        // Get array elements from the user
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array elements
        System.out.print("Array elements are: {");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        // Create an instance of the SubarrayGenerator class
        SubarrayGenerator subarrayGenerator = new SubarrayGenerator();

        // Print all non-empty subarrays using the method from the SubarrayGenerator class
        System.out.println("All non-empty SubArrays:");
        subarrayGenerator.printSubarrays(arr);
        sc.close();
    }
}
