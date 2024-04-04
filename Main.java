import java.util.Arrays;


public class Main
{
  public static void main (String[]args)
  {
  	Person kelvinPerson = new Person ("Kelvin", "brasileiro", "26/03/1995", 5);
  	
  	Person kelvinCopy = new Person (kelvinPerson);
	
	  System.out.println (kelvinPerson.getName ());

	  kelvinCopy.setName ("Ana");
	  System.out.println(kelvinCopy.applyPassaport());
	  
	  
	  System.out.println();
	  kelvinPerson.chooseSeat();
	 // System.out.println(kelvinPerson.getSeatNumber());
	 // System.out.println(Arrays.toString(kelvinPerson.getPassaport()));
	  
	  
	  
	  if(kelvinPerson.applyPassaport())
	  {
	   
  	  kelvinPerson.setPassaport(); 
  	    
  	  System.out.println("Name: " + kelvinPerson.getName() + "\n" + 
      "Nationality: " + kelvinPerson.getNationality() + "\n" + 
      "Date of Birth: " + kelvinPerson.getDateOfBirth() + "\n" +
      "Seat Number: " + kelvinPerson.getSeatNumber() + "\n" + "Passport: " +
       Arrays.toString(kelvinPerson.getPassaport()) + "\n");
	  }
	  else
	  {
  	    System.out.println("Name: " + kelvinPerson.getName() + "\n" + 
      "Nationality: " + kelvinPerson.getNationality() + "\n" + 
      "Date of Birth: " + kelvinPerson.getDateOfBirth() + "\n" +
      "Seat Number: " + kelvinPerson.getSeatNumber() + "\n" + "Passport: " +
       Arrays.toString(kelvinPerson.getPassaport()) + "\n");
	  }
	  
	  
	  
    System.out.println("\n" + kelvinPerson);
    
  }
}
