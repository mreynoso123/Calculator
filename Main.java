import java.text.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My first calculator program");
        System.out.println("============================================");

        boolean validInput = true;

        while (validInput) {
            System.out.println("");
            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Division");
            System.out.println("[5] Percent");

            System.out.print("What operation are you looking to do? ");
            int operation = scanner.nextInt();

            System.out.print("Enter first number: ");
            double input1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double input2 = scanner.nextDouble();

            double total = 0;
            // formats decimal numbers without the .0
            DecimalFormat decimalFormat = new DecimalFormat("#.##");

            switch (operation) {
                case 1:
                    total = input1 + input2;
                    break;

                case 2:
                    total = input1 - input2;
                    break;

                case 3:
                    total = input1 * input2;
                    break;

                case 4:
                    total = input1 / input2;
                    break;

                default:
                    total = (input1 * 100) / input2;
                    System.out.println("The output is: " + decimalFormat.format(total) + "%");
                    break;
            }

            System.out.println("The output is: " + decimalFormat.format(total));
            System.out.print("Try again (Y/N)? ");
            String response = scanner.next().toUpperCase();

            if(response.matches("N|NO")){
                validInput = false;
            }
        }

        scanner.close();
    }
}
