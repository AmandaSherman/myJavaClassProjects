import java.util.Scanner;

public class Rock_paper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1-rock, 2-paper, or 3-scissor: ");
        int human = input.nextInt();

        int computer = (int)((Math.random() * (4 - 1)) + 1);
        System.out.println("The computer chose: "+ computer);
    }

}
