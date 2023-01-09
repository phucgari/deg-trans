import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double deg;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    deg = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(deg));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    deg = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + celsiusToFahrenheit(deg));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double celsiusToFahrenheit(double deg){
        double fahrenheit = (9.0 / 5) * deg + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double deg){
        double celsius = (5.0 / 9) * (deg - 32);
        return celsius;
    }
}
