import java.util.ArrayList;
import java.util.Scanner;
class todo {
    public static void main(String[] args) {
        Scanner jake = new Scanner(System.in);
        ArrayList<String> EricIsAmazing = new ArrayList<String>(); //list that stores the to do list items
        System.out.println("How many items do you want on your to-do list?");
        int InputLength = jake.nextInt();
        int ListLength = 0;
        jake.nextLine();
        while (ListLength < InputLength) { //runs while the length of the to do list is less than the length the user entered
            System.out.println("Add something to the list");
            String input = jake.nextLine();
            EricIsAmazing.add(input);
            ListLength = EricIsAmazing.size(); //makes the created variable for length the actual "size"(length smh) of the list
        }
        System.out.println("Do you want to add anything you might have forgotten? yes or no");//adding elements the user forgot
        String choice = jake.nextLine();
        if (choice.equals("yes")) { //yes/no question and adding to the list whatever the user enters
            System.out.println("Add something extra to the list");
            String addition = jake.nextLine();
            EricIsAmazing.add(addition);
        } else if (choice.equals("no")) {
            System.out.println("Ok");
        }
        System.out.println("Would you like to remove anything from your list?");//removing an element the user might not want
        String remove = jake.nextLine();
        if (remove.equals("yes")) { //yes/no question w/ removing an item from the list(EricIsAmazing)
            System.out.println("Remove something from your list, spelled exactly as entered");
            String addition = jake.nextLine();
            EricIsAmazing.remove(addition);
        } else if (remove.equals("no")) {
            System.out.println("Ok");
        }
        System.out.println("Your final list is");//printing the list
        for (String item : EricIsAmazing) {
            System.out.println("- " + item);
        }
    }
}