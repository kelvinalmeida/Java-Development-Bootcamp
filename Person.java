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
				 int seatNumber, String[] passport)
  {
	this.name = name;
	this.nationality = nationality;
	this.dateOfBirth = dateOfBirth;
	this.seatNumber = seatNumber;
	this.passport = Arrays.copyOf(passport, passport.length);
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
	return this.passport;
  }

  public void setPassaport (String[] passport)
  {
	this.passport = passport;
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

}