import java.util.Scanner;
import java.util.Random;
class Sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter how long you want your list to be");
        int length = input.nextInt();
        System.out.println("Enter the range (from 0 to this value)");
        int range = input.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(range);
        }
        for (int e = 0; e < length - 1; e++) {
            for (int z = 0; z < length - e - 1; z++) {
                if (array[z] > array[z + 1]) {
                    int w = array[z];
                    array[z] = array[z + 1];
                    array[z + 1] = w;
                }
            }
        }
        System.out.println("The list of sorted numbers from least to greatest");
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}