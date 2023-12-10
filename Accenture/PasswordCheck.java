import java.util.*;
class PasswordCheck
{
     int isValidPassword(String str)
    {
        if(str.length()<4)
        {
            return 0;
        }
        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasInvalidChar = false;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (ch == ' ' || ch == '/') {
                hasInvalidChar = true;
            }
        }

        if (!hasDigit || !hasUpperCase || hasInvalidChar) {
            return 0; 
        }

        return 1; 
    }

    public static void main(String[] args) {
        String password = "aA1_67";
        PasswordCheck ref=new PasswordCheck();
        
        int result = ref.isValidPassword(password);
        System.out.println("Output: " + result);
    }
}
