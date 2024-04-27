import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String title = promptForTitle(scanner);
        String publisher = promptForPublisher(scanner);
        int issueNumber = promptForIssueNumber(scanner);
        int publicationYear = promptForPublicationYear(scanner);
    
        Magazine newMagazine = new Magazine(title, publisher, issueNumber, publicationYear);
    
        MagazineLibrary library = new MagazineLibrary();
        library.addMagazine(newMagazine);
    
        System.out.println("Magazine added to the library: " + newMagazine.getTitle());
    }

    public static boolean isNullOrBlank(String string) {
        return string.isBlank() || string == null ? true : false; 
    }

    public static boolean incorrectIssueNumber(int issueNumber) {
        return issueNumber <= 0 ? true : false;
    }

    public static boolean incorrectPublicationYear(int publicationYear) {
        return publicationYear <= 0 ? true : false;
    }

    public static String promptForTitle(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid title: ");
        String title = scanner.nextLine();
        
        if(!isNullOrBlank(title)) return title;
        
        }
    }

    public static String promptForPublisher(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid publisher: ");
            String publisher = scanner.nextLine();
            
            if(!isNullOrBlank(publisher)) return publisher;
        }
    }


    public static int promptForIssueNumber(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid issue number (greater than 0): ");
            // First check if the next input is not an integer
                  // scanner.next();
                  // continue;

            if(!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }
            
            int issueNumber = scanner.nextInt();

            if(!incorrectIssueNumber(issueNumber)) return issueNumber;    
        }
    }


    public static int promptForPublicationYear(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid publication year (greater than 0): ");
            // First check if the next input is not an integer
                  // scanner.next();
                  // continue;

            if(!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }

            int publicationYear = scanner.nextInt();
            if(!incorrectPublicationYear(publicationYear)) return publicationYear;  
        }
    }
}
    