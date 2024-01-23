import java.util.ArrayList;
import java.util.Scanner;
class todo {
    public static void main(String[] args) {
        Scanner jake = new Scanner(System.in);
        ArrayList<String> EricIsAmazing = new ArrayList<String>(); //list that stores the to do list items
        System.out.println("What is your name?");
        boolean repeat = true;
        jake.nextLine();
        while (repeat) { //runs until the user says to stop
            System.out.println("Add something to the list");
            String input = jake.nextLine();
            EricIsAmazing.add(input);
            System.out.println("Do you want to stop?");
            String answer = jake.nextLine();
            if (answer.equals("yes")) {
                break;
            }
        }
        System.out.println("Do you want to add anything you might have forgotten? yes or no");//adding elements the user forgot
        String choice = jake.nextLine();
        if (choice.equals("yes")) { //yes/no question and adding to the list whatever the user enters
            while (choice.equals("yes")) {
                System.out.println("Add something extra to the list");
                String addition = jake.nextLine();
                EricIsAmazing.add(addition);
                System.out.println("Would you like to stop?");
                String response = jake.nextLine();
                if (response.equals("yes")) {
                    break;
                }
            }
        } else if (choice.equals("no")) {
            System.out.println("Ok");
        }
        System.out.println("Would you like to remove anything from your list?");//removing an element the user might not want
        String remove = jake.nextLine();
        if (remove.equals("yes")) { //yes/no question w/ removing an item from the list(EricIsAmazing)
            while (choice.equals("yes")) {
                System.out.println("remove something from the list, spelling exactly as entered");
                String removed = jake.nextLine();
                EricIsAmazing.remove(removed);
                System.out.println("Would you like to stop?");
                String response = jake.nextLine();
                if (response.equals("yes")) {
                    break;
                }
            }
        } else if (remove.equals("no")) {
            System.out.println("Ok");
        }
        System.out.println("Your final list is");//printing the list
        for (String item : EricIsAmazing) {
            System.out.println("- " + item);
        }
    }
}