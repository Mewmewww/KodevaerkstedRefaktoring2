import java.util.Scanner;
public class Vistid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("write fancy text");
        int Sekunder = input.nextInt();

        Tid(Sekunder);

    }

    public static void Tid(int Sekunder) {
        int minutter = Sekunder / 60;
        int nuvaerende_sekunder = Sekunder % 60;
        System.out.println(Sekunder + " Sekunder is " + minutter + " minutter and " + nuvaerende_sekunder + "sekunder");
    }
}

