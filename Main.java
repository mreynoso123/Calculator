import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My first calculator program");
        System.out.println("============================================");
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        System.out.print("What operation are you looking to do? ");
        int operation = scanner.nextInt();

        System.out.print("Enter first number: ");
        int input1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int input2 = scanner.nextInt();
        int total = 0;

        if (operation == 1) {
            total = input1 + input2;
        } else if (operation == 2) {
            total = input1 - input2;
        } else if (operation == 3) {
            total = input1 * input2;
        } else {
            total = input1 / input2;
        }

        System.out.println("The output is: " + total);

        scanner.close();
    }
}
