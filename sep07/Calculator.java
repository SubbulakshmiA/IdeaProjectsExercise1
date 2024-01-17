import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0.0;
        double number1;
        double number2;
        String input1;
        String input2;

        System.out.println("Welcome to the Command-Line Calculator!");
        System.out.println("Enter a number, an operator (+, -, *, /), and another number.");

        while (true) {
            System.out.print("Enter a number (or 'q' to quit): ");
            input1 = scanner.nextLine();

            if (input1.equalsIgnoreCase("q")) {
                break; // Exit the program if 'q' is entered
            }

            try {
                System.out.print("Enter an operator (+, -, *, /): ");
                char operator = scanner.nextLine().charAt(0);

                System.out.print("Enter another number: ");
                input2 = scanner.nextLine();

                if(  isNumber(input1) && isNumber(input2)) {
                    number1 = Double.parseDouble(input1);
                    number2 = Double.parseDouble(input2);

                    switch (operator) {
                        case '+':
                            result = number1 + number2;
                            break;
                        case '-':
                            result = number1 - number2;
                            break;
                        case '*':
                            result = number1 * number2;
                            break;
                        case '/':
                            if (number2 != 0) {
                                result = number1 / number2;
                            } else {
                                System.out.println("Error: Division by zero.");
                                continue; // Skip further processing for this iteration
                            }
                            break;
                        default:
                            System.out.println("Error: Invalid operator.");
                            continue; // Skip further processing for this iteration
                    }
                }
                System.out.println("Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a number.");
            }
        }

        System.out.println("Thank you for using the Command-Line Calculator!");
        scanner.close();
    }
    public static boolean isNumber(String number){
        int len = number.length();
        for(int i=1;i<len;i++){
            char c = number.charAt(i);
            if (Character.isDigit(c)){
                i++;
            }
        }
        return true;
    }

}
