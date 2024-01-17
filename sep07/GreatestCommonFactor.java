import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first positive integer: ");
        int num1 = scanner.nextInt();

        // Validate that num1 is a positive integer
        if (num1 <= 0) {
            System.out.println("Please enter a positive integer for the first number.");
            scanner.close();
            return;
        }

        System.out.print("Enter the second positive integer: ");
        int num2 = scanner.nextInt();

        // Validate that num2 is a positive integer
        if (num2 <= 0) {
            System.out.println("Please enter a positive integer for the second number.");
            scanner.close();
            return;
        }

        int gcd = findGCD(num1, num2);

        System.out.println("The greatest common divisor (GCD) of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
