import java.util.Scanner;

public class Rock_paper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1-rock, 2-paper, or 3-scissor: ");
        int human = input.nextInt();

        int computer = (int)((Math.random() * (4 - 1)) + 1);
        System.out.print("The computer chose: "+ computer + "-");

        switch (computer) {
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("Scissor");
        }
        if (human == computer)
            System.out.println("Tie Game");
        else if (((human == 1) && (computer == 2))
            || ((human == 2) && (computer == 3))
            || ((human == 3) && (computer == 1)))
            System.out.println("You lose");
        else if (((human == 1) && (computer == 3))
                || ((human == 2) && (computer == 1))
                || ((human == 3) && (computer == 2)))
            System.out.println("You win!");
    }

}
