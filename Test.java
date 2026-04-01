public class Test {
    public static void main(String[] args) {
        // Check if the user provided all 3 arguments (Num1, Operator, Num2)
        if (args.length < 3) {
            System.out.println("Error: Missing arguments.");
            System.out.println("Usage: java Test <number1> <operator> <number2>");
            System.out.println("Example: java Test 10 + 5");
            return;
        }

        try {
            // Parse arguments from the command line
            double num1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double num2 = Double.parseDouble(args[2]);
            double result = 0;

            // Perform the math
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                case "x": // Support both '*' and 'x'
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Error: Invalid operator. Use +, -, *, or /");
                    return;
            }

            // Print the result for the Jenkins log
            System.out.println("hello this for test purpose only");
            System.out.println("11");
            System.out.println("Calculation: " + num1 + " " + operator + " " + num2);
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid numbers.");
        }
    }
}
