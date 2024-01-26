// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;
import java.util.*;
class Doctor_Patient{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> ages = new ArrayList<>();
        int totalIncome = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Enter age value (press Enter without a value to stop): ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            int age = Integer.parseInt(input);
            if (age > 0 && age <= 120) {
                ages.add(age);
            } else {
                System.out.println("INVALID INPUT");
                i--; // Decrementing i to re-enter the age for this iteration
            }
        }

        for (int age : ages) {
            if (age < 17) {
                totalIncome += 200;
            } else if (age >= 17 && age <= 40) {
                totalIncome += 400;
            } else {
                totalIncome += 300;
            }
        }

        System.out.println("Total Income " + totalIncome + " INR");
    }
}
