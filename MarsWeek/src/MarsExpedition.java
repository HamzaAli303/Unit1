import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() throws InterruptedException{
    Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);
        System.out.println("Starting ....");
        Thread.sleep(2000);
        System.out.println("Loading ....");
        Thread.sleep(2000);
        System.out.println("Almost done ....");
        Thread.sleep(2000);
        System.out.println("You may start the game :)");

        System.out.print("Enter Username: ");
    String name = scanner.nextLine();
        Thread.sleep(1000);
        System.out.print("Hi, " + name + " Welcome to the Expedition prep program. Are you ready to head out into the world? Type Y or N: ");
    String answer = scanner.nextLine();
        Thread.sleep(2000);
        if(answer.equals("Y") || answer.equals("y")) {
        System.out.println("I knew you would say that. You are team leader for a reason.");
    } else {
        System.out.println("Too bad you are team leader. You have to go.");
    }
        Thread.sleep(1000);
        System.out.print("How many players would you like on your team? ");
    int players = scanner.nextInt();
    int teamSize = 2;
    int seats = 3;
        if(players > teamSize){
        System.out.println("That's way to many people. We can only send 2 more members.");
    } else if(teamSize > players){
        System.out.println("That is not enough players. We need 2 more");
    } else {
        System.out.println("You have your team!");
    }
        Thread.sleep(2000);
        System.out.print("You are allowed to bring one snack with you. What would you like to bring? ");
    String snack = scanner.next();
        Thread.sleep(2000);
        System.out.print("Nice choice, you will be bringing a " + snack + " with you.");

        System.out.println("what car would you like to drive? ");
        Thread.sleep(1000);
        System.out.println("A: The horse " +
                "B: The lion " +
                "C: The machine");
        System.out.print("Select from the options above: ");
    String vehicle = scanner.next();

        if(vehicle.equals("A")){
        System.out.println("Your vehicle choice is The horse ");
    } else if(vehicle.equals("B")){
        System.out.println("Your vehicle choice is The lion");
    } else if(vehicle.equals("C")){
        System.out.println("Your vehicle choice is The machine");
    } else {
        System.out.println("Walking");
    }
        Thread.sleep(2000);
        System.out.println("Thank you, " + name + ".You have " + teamSize + " on your team. Your vehicle of choice is a " + vehicle + ". Starting mission in..." );
        Thread.sleep(2000);
        System.out.println("3...");
        Thread.sleep(2000);
        System.out.println("2...");
        Thread.sleep(2000);
        System.out.println("1...");
        Thread.sleep(1000);
        System.out.println("START!!!");




}
}
