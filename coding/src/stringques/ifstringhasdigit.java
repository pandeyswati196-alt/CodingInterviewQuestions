package stringques;

public class ifstringhasdigit {
	public static boolean onlyDigits(String s) {
	      
        // Traverse each character in the string
        for (int i = 0; i < s.length(); i++) {
          
            // Check if the character is not a digit
            if (!Character.isDigit(s.charAt(i))) {
              
                // If any character is not a digit, return false
                return false; 
            }
        }
        return true;  // If all characters are digits, return true
    }

    public static void main(String[] args) {
      
        System.out.println(onlyDigits("1234"));       
        System.out.println(onlyDigits("123s"));       
    }
}


