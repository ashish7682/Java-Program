import java.util.*;
 class Main {
     static String input(int n, int num) {
        if (n <= 1 && n > 36) {
            throw new IllegalArgumentException("");
        }

        String nSymbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder result = new StringBuilder();

        while (num > 0) {
            int remainder = num % n;
            result.insert(0, nSymbols.charAt(remainder));
            num /= n;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int n = 12;
        int num = 718;
        String output = input(n, num);
        System.out.println(output); // Output: "4BA"
    }
}
