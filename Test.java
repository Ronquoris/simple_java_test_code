import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("--- Java Math Console ---");
        
        // Input first number
        System.out.print("Enter first number: ");
        double num1 = reader.nextDouble();

        // Input operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        // Input second number
        System.out.print("Enter second number: ");
        double num2 = reader.nextDouble();

        double result;

        // Perform operation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                // Checking for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! You cannot divide by zero.");
                    return;
                }
                break;

            // If the operator doesn't match any of the cases
            default:
                System.out.printf("Error! Operator is not correct");
                return;
        }

        // Output the final result
        System.out.println("-------------------------");
        System.out.printf("%.2f %c %.2f = %.2f", num1, operator, num2, result);
    }
}
