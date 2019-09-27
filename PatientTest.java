import java.util.Scanner;//Scanner Class 

public class PatientTest {
    
 public static void main (String[] args)
 {
 String firstName;
 String middleName;
 String lastName;
 String streetAddress;
 String City;
 String State;
 String zipCode;
 String emergencycontactNumber;
 String emergencycontactName;
         
     Scanner keyboard = new Scanner(System.in);//Creates scanners for keyboard
     
     
      System.out.println("What is your first name? ");
      firstName = keyboard.nextLine();
      
      System.out.println("What is your middle name? ");
                      middleName = keyboard.nextLine();
                      
      System.out.println("What is your last name? ");
                      lastName = keyboard.nextLine();
                      
      System.out.println("What is your street address? ");
                        streetAddress= keyboard.nextLine();
      
       System.out.println("Enter city ");
                        City = keyboard.nextLine();
      
       System.out.println("Enter state ");
                       State = keyboard.nextLine();
      
       System.out.println("Enter zip code ");
                      zipCode = keyboard.nextLine();
      
       System.out.println("What is your emergency contact's name? ");
                      emergencycontactName = keyboard.nextLine();
      
       System.out.println("What is your emergency contact's phone number? ");
                      emergencycontactNumber = keyboard.nextLine();
     
          System.out.println();
          Patient list = new Patient(firstName, middleName, lastName, streetAddress, City, State, zipCode, emergencycontactNumber, emergencycontactName);
          System.out.println("Here is the information you provided: ");
          System.out.println("First Name: " + list.getfName());
          System.out.println("Middle Name: " + list.getmName());
          System.out.println("Last Name: " + list.getlName());
          System.out.println("Street Address: " + list.getsAddress());
          System.out.println("City: " + list.getcCity());
          System.out.println("City: " + list.getsState());
          System.out.println("City: " + list.getzCode());
          System.out.println("City: " + list.getecName());
          System.out.println("City: " + list.getecNumber());
}
 
}
