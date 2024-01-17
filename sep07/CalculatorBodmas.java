import java.util.Scanner;

public class CalculatorBodmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0.0;

        System.out.println("Welcome to the Command-Line Calculator with BEDMAS!");
        System.out.println("Enter a number, an operator (+, -, *, /, ^), another number, or use parentheses.");
        System.out.println("You can also enter 'q' to quit.");

        while (true) {
            System.out.print("Enter an expression (or 'q' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break; // Exit the program if 'q' is entered
            }

            try {
                result = evaluateExpression(input);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Thank you for using the Command-Line Calculator with BEDMAS!");
        scanner.close();
    }

    public static double evaluateExpression(String expression) {
        // Remove spaces from the expression
        expression = expression.replaceAll("\\s+", "");

        return evaluateBEDMAS(expression);
    }

    public static double evaluateBEDMAS(String expression) {
        // Evaluate expressions inside parentheses first
        while (expression.contains("(")) {
            int openParenIndex = expression.lastIndexOf('(');
            int closeParenIndex = expression.indexOf(')', openParenIndex);

            if (openParenIndex == -1 || closeParenIndex == -1) {
                throw new IllegalArgumentException("Invalid parentheses placement.");
            }

            String subExpression = expression.substring(openParenIndex + 1, closeParenIndex);
            double subResult = evaluateBEDMAS(subExpression);
            expression = expression.substring(0, openParenIndex) + subResult + expression.substring(closeParenIndex + 1);
        }

        // Evaluate exponentiation (^)
        while (expression.contains("^")) {
            int index = expression.indexOf("^");
            int leftIndex = findLeftOperandIndex(expression, index);
            int rightIndex = findRightOperandIndex(expression, index);

            double leftOperand = Double.parseDouble(expression.substring(leftIndex, index));
            double rightOperand = Double.parseDouble(expression.substring(index + 1, rightIndex));

            double result = Math.pow(leftOperand, rightOperand);
            expression = expression.substring(0, leftIndex) + result + expression.substring(rightIndex);
        }

        // Evaluate multiplication (*) and division (/)
        while (expression.contains("*") || expression.contains("/")) {
            int index = -1;

            if (expression.contains("*") && expression.contains("/")) {
                int indexOfMul = expression.indexOf("*");
                int indexOfDiv = expression.indexOf("/");

                index = Math.min(indexOfMul, indexOfDiv);
            } else if (expression.contains("*")) {
                index = expression.indexOf("*");
            } else {
                index = expression.indexOf("/");
            }

            int leftIndex = findLeftOperandIndex(expression, index);
            int rightIndex = findRightOperandIndex(expression, index);

            double leftOperand = Double.parseDouble(expression.substring(leftIndex, index));
            double rightOperand = Double.parseDouble(expression.substring(index + 1, rightIndex));

            if (expression.charAt(index) == '*') {
                double result = leftOperand * rightOperand;
                expression = expression.substring(0, leftIndex) + result + expression.substring(rightIndex);
            } else {
                if (rightOperand == 0) {
                    throw new ArithmeticException("Division by zero.");
                }
                double result = leftOperand / rightOperand;
                expression = expression.substring(0, leftIndex) + result + expression.substring(rightIndex);
            }
        }

        // Evaluate addition (+) and subtraction (-)
        while (expression.contains("+") || expression.contains("-")) {
            int index = -1;

            if (expression.contains("+") && expression.contains("-")) {
                int indexOfAdd = expression.indexOf("+");
                int indexOfSub = expression.indexOf("-");

                index = Math.min(indexOfAdd, indexOfSub);
            } else if (expression.contains("+")) {
                index = expression.indexOf("+");
            } else {
                index = expression.indexOf("-");
            }

            int leftIndex = findLeftOperandIndex(expression, index);
            int rightIndex = findRightOperandIndex(expression, index);

            double leftOperand = Double.parseDouble(expression.substring(leftIndex, index));
            double rightOperand = Double.parseDouble(expression.substring(index + 1, rightIndex));

            if (expression.charAt(index) == '+') {
                double result = leftOperand + rightOperand;
                expression = expression.substring(0, leftIndex) + result + expression.substring(rightIndex);
            } else {
                double result = leftOperand - rightOperand;
                expression = expression.substring(0, leftIndex) + result + expression.substring(rightIndex);
            }
        }

        // The final result should be the last remaining value in the expression
        return Double.parseDouble(expression);
    }

    public static int findLeftOperandIndex(String expression, int operatorIndex) {
        for (int i = operatorIndex - 1; i >= 0; i--) {
            char c = expression.charAt(i);
            if (!Character.isDigit(c) && c != '.') {
                return i + 1;
            }
        }
        return 0;
    }

    public static int findRightOperandIndex(String expression, int operatorIndex) {
        for (int i = operatorIndex + 1; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (!Character.isDigit(c) && c != '.') {
                return i;
            }
        }
        return expression.length();
    }
}