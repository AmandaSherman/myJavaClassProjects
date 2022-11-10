import java.util.Scanner;
import java.util.regex.Pattern;

public class Backwards{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//get the string input
        System.out.print("Enter a string: ");
        String str = input.nextLine();
//split string at whitespace store in temp array
        Pattern p = Pattern.compile("\s");
        String[] temp = p.split(str);
        String rev = "";
//reverse the temp and display rev
        for (int i=0; i < temp.length; i++) {
            if (i == temp.length - 1) rev = temp[i] + rev;
            else rev = " " + temp[i] + rev;
        }
        System.out.println("The reversed string is: " + rev);
    }
}