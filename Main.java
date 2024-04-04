public class Main {
    public static void main(String[] args) {
        Person kelvinPerson = new Person("Kelvin", "brasileiro", "26/03/1995", 5);
        Person kelvinCopy = new Person(kelvinPerson);
        System.out.println(kelvinPerson.getName());

        kelvinCopy.setName("Ana");
        System.out.println(kelvinCopy.getName());
    }
}