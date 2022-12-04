import java.util.Scanner;
import java.lang.Math;
public class Guessgame {    
    public static void guess() {
        // Generating a random number
        int answer = (int) (Math.random() * 100) + 1;
        System.out.println(answer);
        int k = 6;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100.\nYou have 6 chances to guess a correct number");
        while (k > 0) {
            System.out.println("Guess the number");
            int guess = input.nextInt();
            if (guess == answer) {
                System.out.println("Congrats!! You won the game ");
                break;
            } else if (k == 1) {
                System.out.println("Your chances are finished!!");
                break;
            } else if (guess > answer) {
                System.out.println(
                        "You entered the  greater number .Try a small number\n You have " + (k - 1) + " Chances left");
            } else {
                System.out.println("You entered the  smaller number .Try a greater number\n You have " + (k - 1)
                        + " Chances left");
            }
            k--;

        }

        if (k == 1) {
            System.out.println("Correct number is " + answer);
        }
        System.out.println("Want to play again!\nYes or No");
        String ch = input.next();
        if (ch.equals("Yes") || (ch.equals("yes"))) {
            guess();
        } else {
            System.out.println("Thanks for playing!!");
        }
    }

    public static void main(String[] args) {
        // Calling the function 
        guess();
    }
}
