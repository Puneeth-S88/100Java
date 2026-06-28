import java.util.Scanner;

public class up_or_low {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println("Uppercase letter");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("Lowercase letter");
        } else {
            System.out.println("Not an alphabet character");
        }
    }
}