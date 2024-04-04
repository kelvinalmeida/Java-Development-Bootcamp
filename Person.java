import java.util.Arrays;


public class Person
{
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;


  public static void main (String[]args)
  {

  }

  public Person (String name, String nationality, String dateOfBirth,
				 int seatNumber)
  {
	this.name = name;
	this.nationality = nationality;
	this.dateOfBirth = dateOfBirth;
	this.seatNumber = seatNumber;
	this.passport = new String[3];
  }

  public Person (Person source)
  {
	this.name = source.name;
	this.nationality = source.nationality;
	this.dateOfBirth = source.dateOfBirth;
	this.seatNumber = source.seatNumber;
  }

  public String getName ()
  {
	return name;
  }

  public void setName (String name)
  {
	this.name = name;
  }
  
  public String[] getPassaport ()
  {
	return Arrays.copyOf(this.passport, this.passport.length);
  }

  public void setPassaport ()
  {
	this.passport = new String[] {name, nationality, dateOfBirth};
  }

  public String getNationality ()
  {
	return this.nationality;
  }

  public void setNationality (String nationality)
  {
	this.nationality = nationality;
  }

  public String getDateOfBirth ()
  {
	return dateOfBirth;
  }

  public void setDateOfBirth (String dateOfBirth)
  {
	this.dateOfBirth = dateOfBirth;
  }

  public int getSeatNumber ()
  {
	return seatNumber;
  }

  public void setSeatNumber (int seatNumber)
  {
	this.seatNumber = seatNumber;
  }

  public boolean applyPassaport ()
  {
    int number = (int) (Math.random() * 2);
    return number == 1 ? true : false;
  }
  
  public void chooseSeat() 
  {
    int numberOfSeat = (int)(Math.random() * 11 + 1);
    this.seatNumber = numberOfSeat;
  }
  
  public String toString() {
    return "Name: " + this.name + "\n" + "Nationality: " + 
    this.nationality + "\n" + "Date of Birth: " + 
    this.dateOfBirth + "\n" + "Seat Number: " +
    this.seatNumber + "\n" + "Passport: " + 
    Arrays.toString(passport) + "\n";

  }

}
