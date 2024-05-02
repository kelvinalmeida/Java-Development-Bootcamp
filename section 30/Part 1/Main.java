import java.util.Scanner;

import model.BodyType;
import model.Car;
import model.CarDealership;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String make = promptForMake(scanner);
        String model = promptForModel(scanner);
        BodyType bodyType = promptForBodyType(scanner);
        int year = promptForYear(scanner);
        double price = promptForPrice(scanner);
    
        Car newCar = new Car(make, model, bodyType, year, price);
    
        CarDealership dealership = new CarDealership();
        dealership.addCar(newCar);
    
        System.out.println("Car added to the dealership: " + newCar.getMake() + " " + newCar.getModel());
    }
    


    public static boolean isNullOrBlank(String input) {
        return input.isBlank() || input == null;
    }

    public static boolean invalidYear(int input) {
        return input < Car.MINIMUN_YEAR;
    }

    public static boolean invalidPrice(double price) {
        return price < Car.PRICE_LESS_THAN || price > Car.PRICE_GREATER_THAN;
    }

    public static boolean invalidBodyType(String bodyType) {

        String bodyType_UPCASE = bodyType.toUpperCase();

        try {
            BodyType.valueOf(bodyType_UPCASE);
            return false;

        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public static BodyType promptForBodyType(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car body type: ");
            String bodyType = scanner.nextLine();
            
            if(!invalidBodyType(bodyType)) {
                BodyType bodyTypeEnum = BodyType.valueOf(bodyType.toUpperCase());
                return bodyTypeEnum;
            }
        }
    }


    public static String promptForMake(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car make: ");
            String make = scanner.nextLine();

            if( !isNullOrBlank(make) ) {
                return make;
            }

        }
    }

    public static String promptForModel(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car model: ");
            String model = scanner.nextLine();
            
            if( !isNullOrBlank(model) ) {
                return model;
            }
        }
    }

    public static int promptForYear(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid production year: ");

            if(!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }
            
            int year = scanner.nextInt();

            if(!invalidYear(year)) {
                return year;
            }
        }
    }

    public static double promptForPrice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car price: ");
            
            if(!scanner.hasNextDouble()) {
                scanner.next();
                continue;
            }

            double price = scanner.nextDouble();

            if(!invalidPrice(price)) return price;
        }
    }
}