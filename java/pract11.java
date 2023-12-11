public class pract11 {
    // public class pract {
        public static void main(String[]args) {
            int []arr1 = new int[]{1,2,3,4,5,6,7};
            int arr2[] = new int[arr1.length];
            for(int i = 0; i<=arr1.length;i++) {
                arr2[i]=arr1[i];
            }
            System.out.println("First array: ");
            for(int i = 0; i<=arr1.length;i++) {
                System.out.print(arr1[i]+" ");
    
            }
            System.out.println("Copy of first array:");
            for (int j : arr2) {
                System.out.println(j + "");
            }
    
        }
    }
    
    
    
// }
