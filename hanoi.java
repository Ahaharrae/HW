import java.util.Scanner;
public class hanoi {
    static int number = 0;
    public static void towers_of_hanoi(int n, char first, char second, char third) {
        if (n == 1) {
            number++;
            System.out.println("Move disk 1 from "+first+" to "+third);
            return;
        }
        towers_of_hanoi(n - 1, first, third, second);
        System.out.println("Move disk "+n+" from "+first+" to "+third);
        towers_of_hanoi(n - 1, second, first, third);
        number++;
    }
    public static void main(String[] args) {
        Scanner jake = new Scanner(System.in);
        System.out.println("Enter how many disks you want");
        int amount = jake.nextInt();
        towers_of_hanoi(amount, 'A', 'B', 'C');
        int times = (int)(Math.pow(2,amount)-1);
        System.out.println("The minimum number of moves is "+number+" (adding 1 every time a disk is moved) and "+times+"(using (2^n)-1)");
    }
}