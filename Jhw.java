import java.util.Scanner;
public class Jhw {
    private static int d;

    public static void main(String[] args) {
        Scanner jake = new Scanner(System.in);
        String[] inv = new String[8];
        inv[0]="apple";
        inv[1]="banana";
        inv[2]="cookie";
        inv[3]="pie";
        inv[4]="ice cream";
        inv[5]="egg";
        inv[6]="milk";
        inv[7]="cereal";
        int count = 0;
        int[] prices = new int[8];
        prices[0] = 2;
        prices[1] = 3;
        prices[2] = 2;
        prices[3] = 4;
        prices[4] = 5;
        prices[5] = 1;
        prices[6] = 6;
        prices[7] = 7;
        int together = 0;
        System.out.println("Enter how many items you want on your shopping list");
        String[] list = new String[jake.nextInt()];
        int[] amounts = new int[list.length];
        for (int said = 0; said < list.length; said++) {
            System.out.println("Enter an item");
            jake.nextLine();
            list[said] = jake.nextLine();
            if (list[said].equals("pie")) {
                together++;
            } if (list[said].equals("ice cream")) {
                together++;
            }
            System.out.println("How many would you like?");
            amounts[count] = jake.nextInt();
            count++;
            }
        if (together == 1) {
            System.out.println("You cannot buy only pie or ice cream, pie and ice cream must be bought together");
            }
        System.out.println("Your shopping list is: ");
        for (String stuff: list) {
            System.out.println("- "+stuff);
        }
        System.out.println("The items out of stock are");
        for (int i = 0; i < list.length; i++) {
            boolean stock = false;
            for (int g = 0; g < inv.length; g++) {
                if (list[i].equals(inv[g])) {
                    stock = true;
                    break;
                }
            }
            if (!stock) {
                System.out.println("-"+list[i]);
            }
        }
        int cost = 0;
        int x = 0;
        int v = 0;
        while (v < list.length) {
            if (list[v].equals(inv[x])) {
                if (list[v].equals("apple")) {
                    int apple_count = amounts[v];
                    cost += (apple_count / 2 + apple_count % 2) * prices[x];
                } else if (list[v].equals("milk")) {
                    boolean contains_cereal = false;
                    for (String list_item : list) {
                        if ("cereal".equals(list_item)) {
                            contains_cereal = true;
                            break;
                        }
                    }
                    if (contains_cereal) {
                        cost += amounts[v] * prices[x] / 2;
                    } else {
                        cost += amounts[v] * prices[x];
                    }
                } else if (list[v].equals("pie")) {
                    boolean ice_cream = false;
                    for (String listItem : list) {
                        if ("ice cream".equals(listItem)) {
                            ice_cream = true;
                            break;
                        }
                    }
                    if (!ice_cream) {
                        System.out.println("Cannot buy pie without ice cream. Removing from the cost.");
                    } else {
                        cost += amounts[v] * prices[x];
                    }
                } else if (list[v].equals("ice cream")) {
                } else {
                    cost += amounts[v] * prices[x];
                }
                x = 0;
                v++;
            } else {
                x++;
                if (x >= inv.length) {
                    x = 0;
                    v++;
                    }
                }
            }
        System.out.println("The cost will be "+cost);
        System.out.println("Happi shopping!");
    }
}
