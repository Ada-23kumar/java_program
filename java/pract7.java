public class pract7 
{

    // Function to print all non-empty substrings of the specified string
    static void printAllSubstrings(String str)
    {
        int n = str.length();
 
        // consider all substrings starting from `i`
        for (int i = 0; i < n; i++)
        {
            // consider all substrings ending at j
            for (int j = i; j < n; j++) {
                System.out.print("'" + str.substring(i, j + 1) + "', ");
            }
        }
    }
    public static void main(String[] args)
    {
        String str = "techie";
        printAllSubstrings(str);
    }
}

