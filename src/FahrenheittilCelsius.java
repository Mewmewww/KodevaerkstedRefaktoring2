import java.util.Scanner;
public class FahrenheittilCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        Fahrenheit_convert(fahrenheit);
    }
    public static void Fahrenheit_convert(double fahrenheit) {

        double celcius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit" + fahrenheit + " er " + celcius + " i Celsius");
    }
}