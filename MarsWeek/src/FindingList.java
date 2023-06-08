import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingList {
    public FindingList() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("welcome back!");
        ArrayList rocks = new ArrayList<>();
        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("no rock");
        Thread.sleep(500);
        System.out.println(rocks);
        System.out.println("Everything is downloaded...");
        rocks.remove("no rock");
        System.out.println(rocks);
        System.out.println("Perfect");
        Thread.sleep(1000);

        HashMap<String, String> fossils = new HashMap<String, String>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded");
        System.out.print("Which of the fossils would you like to learn more about? (Bird, fish, or tooth): ");
        Scanner input = new Scanner(System.in);
        String fossilInput = input.next();

        if(fossilInput.equalsIgnoreCase("Bird")){
            System.out.println(fossils.get("Bird Fossil"));
        } else if(fossilInput.equalsIgnoreCase("fish")){
            System.out.println(fossils.get("Fish Fossil"));
        } else if(fossilInput.equalsIgnoreCase("tooth")){
            System.out.println(fossils.get("Tooth Fossil"));
        } else {
            System.out.println("That is not an option!");
        }
        Thread.sleep(700);
        HashSet<String> supplies = new HashSet<String>();
        supplies.add("Desk");
        supplies.add("Monitor");
        supplies.add("Wood");
        System.out.println("Supplies Before Expedition: ");
        for(String i : supplies){
            System.out.print(i + " ");
        }
        System.out.println("");
        supplies.remove("Monitor");
        System.out.println("Supplies After Expedition: ");
        for(String i : supplies){
            System.out.print(i + " ");
        }
    }
}
