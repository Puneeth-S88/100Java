import java.util.Scanner;
public class atm {
    public static void main(String[]args){
        int pin=8080;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        int inputPin = scanner.nextInt();
        if(inputPin == pin){
            System.out.println("PIN is correct. Access granted.");
        } else {
            System.out.println("Incorrect PIN. Access denied.");
        }
    }
}
