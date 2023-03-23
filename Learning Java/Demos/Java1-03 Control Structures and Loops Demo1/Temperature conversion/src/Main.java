import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner conIn = new Scanner(System.in);
        int choice;
        double inputTemp, result = 0.0;

        do {

            //Display Menu
            System.out.println("\n\nTemperature Conversion Menu\n");
            System.out.println("1.  Fahrenheit to Celsius");
            System.out.println("2.  Fahrenheit to Kelvin");
            System.out.println("3.  Celsius to Fahrenheit");
            System.out.println("4.  Celsius to Kelvin");
            System.out.println("5.  Kelvin to Fahrenheit");
            System.out.println("6.  Kelvin to Celsius\n");
            System.out.println("0.  EXIT\n");
            System.out.print("Enter your choice: ");

            //Get User Choiuce
            while (!conIn.hasNextInt()) {
                conIn.next();
                System.out.print("Enter your choice: ");
            }
            choice = conIn.nextInt();

            //Act on Valid Choices
            if (choice >= 1 && choice <= 6) {
                System.out.print("Enter the input temperature: ");
                inputTemp = conIn.nextDouble();

                if (choice == 1) {
                    result = fToC(inputTemp);
                } else if (choice == 2) {
                    result = fToK(inputTemp);
                } else if (choice == 3) {
                    result = cToF(inputTemp);
                } else if (choice == 4) {
                    result = cToK(inputTemp);
                } else if (choice == 5) {
                    result = kToF(inputTemp);
                } else if (choice == 6) {
                    result = kToC(inputTemp);
                }
                System.out.printf("Converted temperature is: %8.2f", result);

            }

        } while (choice != 0);

        System.out.println("Goodbye");
    }


    public static double fToC(double degF) {
        return (degF - 32.0) * 5.0 / 9.0;
    }

    public static double fToK(double degF) {
        return (degF - 32.0) * 5.0 / 9.0 + 273.15;
    }

    public static double cToF(double degC) {
        return degC * 9.0 / 5.0 + 32.0;
    }

    public static double cToK(double degC) {
        return degC + 273.15;
    }

    public static double kToF(double degK) {
        if (degK < 0) {
            throw new IllegalArgumentException("Kelvin degrees must be not-negative");
        }
        return degK * 9.0 / 5.0 - 459.67;
    }

    public static double kToC(double degK) {
        if (degK < 0) {
            throw new IllegalArgumentException("Kelvin degrees must be not-negative");
        }
        return degK - 273.15;
    }

    //test conversion
    public static void testConversions() {
        double input, expected, result;
        System.out.println("\n\nConversion tests starting; any falures will be noted here:");

        //test fToC
        input = 572.0; expected = 300.0; result = Math.roung(fToC(input) * 100.0) / 100;
        if (result != expected) {
            System.out.println("fToC failed converting " + input + "; expected: " + expected + ", but got " + result);
        }

        System.out.println("Conversion tests ending");
    }
}