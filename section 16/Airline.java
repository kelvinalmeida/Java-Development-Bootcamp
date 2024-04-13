
/**
 * Airline
 */

import java.util.Scanner;
import java.util.Arrays;

public class Airline {

    Person[] people;

    public static void main(String[] args) {

    }

    public Airline() {
        this.people = new Person[11];
    }

    public Person getPerson(int index) {
        return new Person(this.people[index]);
    }

    public void setPerson(Person person) {
        this.people[person.getSeatNumber() - 1] = new Person(person);
    }

    public void createReservation(Person person) {
        int index = person.getSeatNumber() - 1; // seat number used as index.

        Scanner scan = new Scanner(System.in);

        while (people[index] != null) {
            System.out.println("\n" + person.getName() + ", seat: " + (person.getSeatNumber() + 1)
                    + " is already taken. Please choose another seat.\n");
            index = scan.nextInt() - 1;
            person.setSeatNumber(index);
        }

        people[index] = new Person(person); // indexed element is set equal to the object.

        System.out.println("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is "
                + person.getSeatNumber() + ".\n");

        // scan.close();
    }
}