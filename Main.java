import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        // Average of three numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        double average = (num1 + num2 + num3) / 3;

        // Output
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        System.out.println("Average of the three numbers: " + average);

        sc.close();
    }
}