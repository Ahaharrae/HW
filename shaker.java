import java.util.Scanner;
import java.util.Random;
class shaker  {
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

        int begin = 0;
        int end = length - 1;
        while (begin < end) {
            for (int i = begin; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    int value = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = value;
                }
            }
            end--;
            for (int i = end; i > begin; i--) {
                if (array[i] < array[i - 1]) {
                    int value = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = value;
                }
            }
            begin++;
        }
        System.out.println("The list of sorted numbers from least to greatest");
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}