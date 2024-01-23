import java.util.ArrayList;
import java.util.Scanner;
class shopping {
    public static void main(String[] args) {
        Scanner jake = new Scanner(System.in);
        ArrayList<String> EricIsAmazing = new ArrayList<String>();
        System.out.println("How many items do you want on your to-do list?");
        int InputLength = jake.nextInt();
        int ListLength = 0;
        jake.nextLine();
        while (ListLength < InputLength) {
            System.out.println("Add something to the list");
            String input = jake.nextLine();
            EricIsAmazing.add(input);
            ListLength = EricIsAmazing.size();
        }
        System.out.println("Do you want to add anything you might have forgotten? yes or no");
        String choice = jake.nextLine();
        if (choice.equals("yes")) {
            System.out.println("Add something extra to the list");
            String addition = jake.nextLine();
            EricIsAmazing.add(addition);
        } else if (choice.equals("no")) {
            System.out.println("Ok");
        }
        System.out.println("Would you like to remove anything from your list?");
        String remove = jake.nextLine();
        if (remove.equals("yes")) {
            System.out.println("Remove something from your list, spelled exactly as entered");
            String addition = jake.nextLine();
            EricIsAmazing.remove(addition);
        } else if (remove.equals("no")) {
            System.out.println("Ok");
        }
        System.out.println("Your final list is");
        for (String item : EricIsAmazing) {
            System.out.println("- " + item);
        }
    }
}