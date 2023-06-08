// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Mars {
    public static void main(String[] args) throws InterruptedException{
        String colonyName = "Hamza";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        meals -= shipPopulation * .75;
        System.out.println(meals);
        meals = meals + (meals * 0.5);
        System.out.println(meals);
        shipPopulation += 5;
        System.out.println(shipPopulation);

        String landingLocation = "The Hill";
        if(landingLocation.equalsIgnoreCase("The Plain")){
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR! flight plan already set. Landing on the Plain");
        }
        landingCheck(10);
        new GuessingGame();
        new MarsExpedition();
        new FindingList();

    }

    public static boolean landingCheck( int minutesLeft) throws InterruptedException {

        for(int minutes = 0; minutes <= minutesLeft; minutes++){
            if((minutes % 3 == 0) && (minutes % 2 == 0)) {
                System.out.println("Keep Center");
            }else if(minutes % 2 == 0){
                System.out.println("Right");
            }else if(minutes % 3 == 0){
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("landed");
        return false;
    }

}