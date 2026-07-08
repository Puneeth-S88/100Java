import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = { "rock", "paper", "scissors" };

        System.out.print("Enter your choice (rock, paper, scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();

        if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            System.out.println("Invalid choice. Please choose rock, paper, or scissors.");
            return;
        }

        int computerChoiceIndex = (int) (Math.random() * 3);
        String computerChoice = choices[computerChoiceIndex];

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }
}