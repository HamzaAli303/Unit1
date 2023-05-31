import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String greeting = "Howdy, what's your name? ";
//        System.out.println(greeting);
//        String playerName = "What is your player name? ";
//        Make an input field for the user!
        Scanner myObj = new Scanner(System.in);
        String userName;
        System.out.print(greeting);
        userName = myObj.nextLine();
        System.out.println(userName + ", I'm thinking of a number between 1 and 100");
//        Guess Number
        System.out.println("Try to guess my number");
        String guessNumber = "Your guess? ";
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print(guessNumber);
        number = Integer.parseInt(input.nextLine());
//        System.out.print(number);

//      Random number generator
//        create an instance of the random object
            Random rand = new Random();
//        call method nextInt and pass in upper range bound
            int number1 = rand.nextInt(100);
            int tries = 0;
//        System.out.println(number1);



//        loop
        while(true) {
//            System.out.println("hello");
            int guess1;
            guess1 = number;
            tries = tries + 1;

            if(guess1 > 100 || guess1 < 1){
                System.out.println("your guess is out of the range, try again.");
            } else if(guess1 < number1){
                System.out.println("Your guess is too low, try again!");
            } else if(guess1 > number1){
                System.out.println("Your guess is too high, try again!");
            } else {
                System.out.println("Well done " + userName);
                System.out.println("You found my number in " + tries + " tries!");
                break;
            }
          System.out.print(guessNumber);
            number = input.nextInt();

        }



    }
}