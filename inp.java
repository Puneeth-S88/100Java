import java.util.Scanner;
public class inp{
    public static void main(String [] args){
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Hello, " + name + "!");

    }
}