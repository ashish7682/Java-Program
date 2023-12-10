public class Carry {
    public static int Numberofcarry(int num1, int num2) {
        int carry = 0;
        int count = 0;

        while (num1 > 0 || num2 > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;

            num1 /= 10;
            num2 /= 10;

            if (carry > 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int num1 = 9999;
        int num2 = 111;
        int output = Numberofcarry(num1, num2);
        System.out.println(output); // Output: 3
    }
}
