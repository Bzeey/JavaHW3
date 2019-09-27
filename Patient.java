/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BGeo1
 */
public class Patient {
    //fields 
   private String fName;
   private String mName;
   private String lName;
   private String sAddress;
   private String cCity;
   private String sState;
   private String zCode;
   private String ecName;
   private String ecNumber;
   
   public Patient(String firstName,String middleName, String lastName, String streetAddress, String City,  String State, String zipCode, String emergencycontactName,  String emergencycontactNumber)
   {
   fName = firstName;
   
   mName = middleName;
   
   lName = lastName;
 
   
   sAddress = streetAddress ;
  
    
   cCity = City;
 
   
   sState = State;

    
   zCode = zipCode;
 
   
   ecName = emergencycontactName;
  
   
   ecNumber = emergencycontactNumber;
   }
   
   //
   
   public void setfName(String firstName)
   {
    fName = firstName;
   }
   
   public void setmName (String middleName)
   {
   mName = middleName;
   }
   
   public void setlastName(String lastName)
   {
    lName = lastName;
   }
   
   public void setsAddress(String streetAddress)
   {
    sAddress = streetAddress;
   }
   
   public void setcCity(String City)
   {
    cCity = City;
   }
   public void setsState(String State)
   {
    sState = State;
   }
   public void setzCode(String zipCode)
   {
    zCode = zipCode;
   }
   public void setecName(String emergencycontactName)
   {
    ecName = emergencycontactName;
   }
   public void setecNumber(String emergencycontactNumber)
   {
    ecNumber = emergencycontactNumber;
   }
   
  
//
   public String getfName()
   {
   return fName;
   }
    
   public String getmName()
           {
           return mName;
           }
   
   public String getlName()
   {
   return  lName;
   }
    
    public String getsAddress()
   {
   return sAddress;
   }
    
     public String getcCity()
   {
   return cCity;
   }
     
      public String getsState()
   {
   return sState;
   }
      
       public String getzCode()
   {
   return zCode;
   }
       
        public String getecName()
   {
   return ecName;
   }
        
         public String getecNumber()
   {
   return ecNumber;
   }
}
  






