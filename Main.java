import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner jake = new Scanner(System.in);
        System.out.println("Enter what shape u want (square, triangle, or hollow square)");
        String input = jake.nextLine();
        System.out.println("Enter the length of the shape");
        int l = jake.nextInt();
        if (input.equals("triangle")) {
            for (int thing = l; thing >= 0; thing--) {
                System.out.println();
                for (int idk = 0; idk < (l - thing); idk++) {
                    System.out.print("*");
                }
            }
        } else if (input.equals("square")) {
            for (int o = l; o > 0; o--) {
                System.out.println();
                for (int i = 0; i < l; i++) {
                    System.out.print("*");
                }
            }
        } else if (input.equals("hollow square")) {
            for (int p = 1; p <= l; p++) {
                if (p == 1 || p == l) {
                    for (int k = 1; k <= l; k++) {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                    for (int k = 1; k <= l - 2; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
}