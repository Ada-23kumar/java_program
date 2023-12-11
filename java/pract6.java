import java.util.Arrays;
import java.util.List;
// import java.lang.String;
public class pract6 
{
   class main
  {
    // Function to print all subarrays of the specified array
    static void printAllSubarrays(List<Integer> input)
    {
        // consider all subarrays starting from `i`
        for (int i = 0; i < input.size(); i++)
        {
            // consider all subarrays ending at `j`
            for (int j = i; j < input.size(); j++)
            {
                // Function to print a subarray formed by [i, j]
                System.out.println(input.subList(i, j + 1));
            }
        }
    }
    // public static void main(String[] args)
      {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        printAllSubarrays(input);
      }
  }
}
