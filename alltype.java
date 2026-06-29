import java.util.Scanner;

public class alltype{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;
        int reverse = 0;
        int sum = 0;

        // Count digits, reverse number, sum digits
        while (temp > 0) {
            int digit = temp % 10;
            count++;
            sum += digit;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Number of digits: " + count);
        System.out.println("Reversed number: " + reverse);
        System.out.println("Sum of digits: " + sum);

        // Palindrome check
        if (num == reverse) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome");
        }

        // Factorial
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);

        // Fibonacci series
        System.out.print("Fibonacci series: ");
        int a = 0, b = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}