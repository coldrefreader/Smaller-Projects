import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Welcome to this calculator - the correct form is (number) (operator) (number). To quit, type 'end'");
        System.out.println("The supported operators are '+', '-', '*', '/', '^'");

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        while (!input.equals("end")) {

            try {
                String[] tokens = input.split(" ");
                if (tokens[1].length() != 1) {
                    System.out.println("Operator must be 1 symbol");
                    input = sc.nextLine();
                    continue;
                }
                double num1 = Double.parseDouble(tokens[0]);
                char operator = tokens[1].charAt(0);
                double num2 = Double.parseDouble(tokens[2]);

                if (operator == '+') {

                    System.out.println(num1 + num2);
                } else if (operator == '-') {

                    System.out.println(num1 - num2);
                } else if (operator == '*') {

                    System.out.println(num1 * num2);
                } else if (operator == '/') {

                    System.out.println(num1 / num2);
                } else if (operator == '^') {

                    System.out.println(Math.pow(num1, num2));
                } else {
                    System.out.println("Error");
                }
                input = sc.nextLine();
            } catch (Exception e) {
                System.out.println("Correct order is (number) (operator) (number)");
                input = sc.nextLine();
            }
        }

        System.out.println("Goodbye!");
    }
}

