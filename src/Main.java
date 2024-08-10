import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 sum");
            System.out.println("2 min");
            System.out.println("3 mult");
            System.out.println("4 div");

            int choice = scanner.nextInt();

            System.out.println("First num:");
            double num1 = scanner.nextDouble();
            System.out.println("Second num:");
            double num2 = scanner.nextDouble();

            if (choice == 1) {
                System.out.println("Nums: " + (num1 + num2));
            } else if (choice == 2) {
                System.out.println("Nums: " + (num1 - num2));
            } else if (choice == 3) {
                System.out.println("Nums: " + (num1 * num2));
            } else if (choice == 4) {
                if (num2 != 0) {
                    System.out.println("Nums: " + (num1 / num2));
                } else {
                    System.out.println("Nah");
                }
            } else {
                System.out.println("No");
            }
        }
    }
}
