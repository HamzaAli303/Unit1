import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public GuessingGame(){
        String greeting = "Howdy, what's your name? ";

        //        System.out.println(greeting);
//        String playerName = "What is your player name? ";
//        Make an input field for the user!
        Scanner input = new Scanner(System.in);
        String userName;
        System.out.print(greeting);
        userName = input.nextLine();
        System.out.println(userName + ", I'm thinking of a number between 1 and 100");
//        Guess Number
        System.out.println("Try to guess my number");
        String guessNumber = "Your guess? ";
        int guess = 0;
        System.out.print(guessNumber);

//        System.out.print(number);

        //      Random number generator
//        create an instance of the random object
        Random rand = new Random();
        //        call method nextInt and pass in upper range bound
        int number = rand.nextInt(100);
        int tries = 0;
//        System.out.println(number1);



//        loop
        while(true) {
//            System.out.println("hello");

            try {
                guess = input.nextInt();
            } catch (InputMismatchException e) {
//                System.out.print("Try again: ");
                String WrongInput = input.next();
                System.out.println("That's not an integer, try again");
                continue;
            }


            if(guess > 100 || guess < 1){
                System.out.println("your guess is out of the range, try again.");
                continue;
            }
            tries = tries + 1;
            if(guess < number){
                System.out.println("Your guess is too low, try again!");
            } else if(guess > number){
                System.out.println("Your guess is too high, try again!");
            } else {
                System.out.println("Well done " + userName);
                System.out.println("You found my number in " + tries + " tries!");
                break;
            }
            System.out.print(guessNumber);

        }
    }




}

