/**
 * Airline
 */
public class Airline {

    Person[] peaple;

    public static void main(String[] args) {

    }

    public Airline() {
        peaple = new Person[11];
    }

    public Person getPerson(int index) {
        return new Person(peaple[index]);
    }

    public void setPerson(Person person) {
        peaple[person.getSeatNumber() - 1] = new Person(person);
    }
}