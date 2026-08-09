package stringques;

public class gcdoftwostring {
	
	public String gcdOfStrings(String str1, String str2) {

        // Step 1: Check if str1 + str2 equals str2 + str1
       // This ensures both strings are made of the same repeating pattern.
       if (!(str1 + str2).equals(str2 + str1)) {
           return ""; // If not, no common divisor string exists
       }

       // Step 2: Find the GCD of the lengths of the two strings
       int gcdLength = gcd(str1.length(), str2.length());

       // Step 3: The GCD string will be the prefix of str1 of length gcdLength
       return str1.substring(0, gcdLength);
   }

   // Step 4: Helper function to compute GCD of two integers using Euclidean algorithm
   private int gcd(int a, int b) {
       while (b != 0) {
           int temp = b;
           b = a % b;
           a = temp;
       }
       return a;
   }

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
