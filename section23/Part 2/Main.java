import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Store store = new Store();

    public static void main(String[] args) {

        try {
            loadMovies("movies.txt");
            printStore();
            userInput();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        String status = "continue";

        while (status.equals("continue")) {
            int choice = (promptForChoice(scanner));
            Movie movie = store.getMovie(choice);
            double rating = promptForRating(scanner, movie.getName());

            movie.setRating(rating);
            store.setMovie(choice, movie);
            printStore();
            System.out.print("To edit another rating, type: 'continue': ");
            status = scanner.next();
        }
        scanner.close();
    }

    public static int promptForChoice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");

            // 1. Anticipate the user not entering an integer.
            int choice = 1;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("The choice must to be a int!\n");
                continue;
            }

            // 2. Anticipate the choice being incorrect.

            if (incorrectChoice(choice)) {
                System.out.println("Invalid CHOICE, try again!\n");
                continue;
            }

            return choice;
        }
    }

    public static boolean incorrectChoice(int choice) {
        if (choice < 0 || choice > 9)
            return true;

        return false;
    }

    public static double promptForRating(Scanner scanner, String name) {
        while (true) {
            System.out.print("\nSet a new rating for " + name + ": ");

            // 1. Anticipate the user not entering a double.
            double rating = 0.0;

            if (scanner.hasNextDouble()) {
                rating = scanner.nextDouble();
            } else
                continue;

            if (incorrectRating(rating)) {
                System.out.println("Invalid RATING, try again!\n");
                continue;
            }
            // 2. Anticipate the rating being incorrect.

            return rating;
        }
    }

    public static boolean incorrectRating(double rating) {
        if (rating < 0 || rating > 10)
            return true;

        return false;
    }

    public static void loadMovies(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);

        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            String[] words = line.split("--");
            store.addMovie(new Movie(words[0], words[1], Double.parseDouble(words[2])));
        }

        scanFile.close();
    }

    public static void printStore() {
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.println(store);
    }

}
