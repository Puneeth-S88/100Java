import java.util.Scanner;
public class lof2{
    public static void main(String [] args){
        int num1;
        int num2;
        Scanner scanner=new Scanner (System.in);
        System.out.println("Enter the 1st number:");
        num1=scanner.nextInt();
        System.out.println("Enter the 2nd numer:");
        num2=scanner.nextInt();
        if(num1>num2){
            System.out.println("Number " + num1 + " is larger ");
        }else{
            System.out.println("Number " + num2 + " is larger ");
            
        }

    }
}