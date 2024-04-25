import java.time.LocalDate;
import java.time.Period;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = toAge(birthDate);
    }

    public Contact(Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    public int toAge(String birthDate) {

        LocalDate dateBirthLocalDate = LocalDate.parse(birthDate);
        LocalDate nowLocalDate = LocalDate.now();

        Period period = Period.between(dateBirthLocalDate, nowLocalDate);

        int age = period.getYears();

        return age;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        setAge(birthDate);
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(String age) {
        this.age = toAge(age);
    }

    @Override
    public String toString() {
        return "age  " + this.age;
    }

}
