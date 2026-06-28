import java.util.Scanner;
public class vorc {
    public static void main(String [] args){
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        Scanner scanner=new Scanner (System.in);
        System.out.println("Enter a character:");
        char ch=scanner.next().charAt(0);
        for (char vowel : vowels) {
            if (ch == vowel) {
                System.out.println(ch + " is a vowel.");
                return;
            }
        }
        System.out.println(ch + " is not a vowel.");
    }

}