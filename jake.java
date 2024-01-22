import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class jake {
    public static void main (String[] args) {
        ArrayList<Double> sashaisgreat = new ArrayList<Double>();
        Scanner sashahasalife = new Scanner(System.in);
        System.out.println("What is ur name");
        String writejocelynplease = sashahasalife.nextLine();
        System.out.println("Press enter to start");
        String sashaisagoodperson = sashahasalife.nextLine();
        double sashahasgoodtimemanagementskills = 0;
        double sashaisverysmart = System.currentTimeMillis() + 10000;
        double sashaisgoodatmath = 0;
        double sashaisreallycool = 0;
        int sashaisreallynice = 0;
        while (sashahasgoodtimemanagementskills < sashaisverysmart) {
            sashaisgreat.add(Math.random() * 100);
            System.out.println(sashaisgreat.get(sashaisreallynice));
            sashaisgoodatmath = sashaisgoodatmath + sashaisgreat.get(sashaisreallynice);
            sashaisreallynice++;
            sashaisreallycool = sashaisgoodatmath/sashaisreallynice;
            System.out.println("Average: "+sashaisreallycool);
            sashahasgoodtimemanagementskills = System.currentTimeMillis();
            if ((writejocelynplease.equals("Jocelyn"))||(writejocelynplease.equals("jocelyn"))) {
                sashahasgoodtimemanagementskills = 0;
                System.out.println("The fun continues :3");
            }
        }
    }
}
