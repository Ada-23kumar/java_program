import java.util.Scanner; 
class Palindrome {
    public boolean isPalindrome(int num) {
        String strNum = Integer.toString(num);
        return isPalindrome(strNum);
    }
    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

class PalindromeList extends Palindrome {
    public void getPalindromeList(int[] numbers) {
        System.out.println("Palindromic Numbers:");
        for (int num : numbers) {
            if (isPalindrome(num)) {
                System.out.print(num + " \n");
            }
        }
        System.out.println();
    }

    public void getPalindromeList(String[] strings) {
        System.out.println("Palindromic Strings:");
        for (String str : strings) {
            if (isPalindrome(str)) {
                System.out.print(str + " \n");
            }
        }
        System.out.println();
    }
}

public class codet{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the number of elements you want to store: "); 
        int n=sc.nextInt();    
        PalindromeList palindromeList = new PalindromeList();
        // int[] numbers = {121, 1331, 12321, 123, 555};
        // String[] strings = {"radar", "level", "hello", "world"};




        int[] array = new int[n]; 
        System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
    array[i]=sc.nextInt();  
}  
palindromeList.getPalindromeList(array);



String[] arrays = new String[n]; 
System.out.println("Enter the elements of the arrays: ");  
for(int i=0; i<arrays.length; i++){
    arrays[i] = sc.next();
    // System.out.println(arrays[i]);
}
        palindromeList.getPalindromeList(arrays);
        sc.close();
    }
    
}