public class Person {
    private String name;
    private String nacionality;
    private String datePfBhirf;
    private int sitNumber;

    public static void main(String[] args) {

    }

    public Person(String name, String nacionality, String datePfBhirf, int sitNumber) {
        this.name = name;
        this.nacionality = nacionality;
        this.datePfBhirf = datePfBhirf;
        this.sitNumber = sitNumber;
    }

    public Person(Person source) {
        this.name = source.name;
        this.nacionality = source.nacionality;
        this.datePfBhirf = source.datePfBhirf;
        this.sitNumber = source.sitNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public String getDatePfBhirf() {
        return datePfBhirf;
    }

    public void setDatePfBhirf(String datePfBhirf) {
        this.datePfBhirf = datePfBhirf;
    }

    public int getSitNumber() {
        return sitNumber;
    }

    public void setSitNumber(int sitNumber) {
        this.sitNumber = sitNumber;
    }

}
