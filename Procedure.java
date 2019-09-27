

import java.util.Date;

public class Procedure {
 //variables          
 private String procedureOne;
 private String procedureTwo;
 private String procedureThree;
 
private Date dateProcedureOne;
private Date dateProcedureTwo;
private Date dateProcedureThree;

private String practitionerOne;
private String practitionerTwo;
private String practitionerThree;


 private double chargeOne; 
 private double chargeTwo;
 private double chargeThree;
 
//public procedure
 public Procedure (String procedure1, String procedure2, String procedure3, Date dateProcedure1, Date dateProcedure2, Date dateProcedure3, String practitioner1, String practitioner2, String practitioner3, double charge1, double charge2, double charge3)
{
  procedureOne = procedure1;
  procedureTwo = procedure2;
  procedureThree = procedure3;

  
  dateProcedureOne = dateProcedure1;
  dateProcedureTwo = dateProcedure2;
  dateProcedureThree = dateProcedure3;

  
  practitionerOne = practitioner1;
  practitionerTwo = practitioner2;
  practitionerThree = practitioner3;

  
chargeOne = charge1;
chargeTwo = charge2;
chargeThree = charge3;
}
//set procedure type
public void setprocedureOne(String procedure1)

{
procedureOne = procedure1;
}
public void setprocedureTwo(String procedure2)
{
procedureTwo = procedure2;
}
public void setprocedureThree (String procedure3)
{
procedureThree = procedure3;
}
//set date of procedure

public void setdateProcedureOne(Date dateProcedure1)

{
dateProcedureOne = dateProcedure1;
}

public void setdateProcedureTwo(Date dateProcedure2)

{
dateProcedureTwo = dateProcedure2;
}

public void setdateProcedureThree(Date dateProcedure3)

{
dateProcedureThree = dateProcedure3;
}
// set practitioner
public void setpractitioner(String practitioner1)

{
practitionerOne = practitioner1;
}

public void setpractitionerTwo(String practitioner2)

{
practitionerTwo = practitioner2;
}

public void setpractitionerThree(String practitioner3)

{
practitionerThree = practitioner3;
}
//set charges
public void setchargeOne(double charge1)
{
chargeOne = charge1;
}

public void setchargeTwo(double charge2)
{
chargeTwo = charge2;
}

public void setchargeThree(double charge3)
{
chargeThree = charge3;    
}
//returns string procedure
public String getprocedureOne()
{
 return procedureOne; 
}

public String getprocedureTwo()
{
 return procedureTwo; 
}

public String getprocedureThree()
{
 return procedureThree; 
}


//return dates procedure
public Date getdateProcedureOne()
{
 return dateProcedureOne; 
}

public Date getdateProcedureTwo()
{
 return dateProcedureTwo; 
}

public Date getdateProcedureThree()
{
 return dateProcedureThree; 
}
//return practictioner
public String getpractitionerOne()
{
 return practitionerOne; 
}

public String getpractitionerTwo()
{
 return practitionerTwo; 
}

public String getpractitionerThree()
{
 return practitionerThree; 
}


//return procedure cost
public double getchargeOne()
{
 return chargeOne; 
}

public double getchargeTwo()
{
 return chargeTwo; 
}

public double getchargeThree()
{
 return chargeThree; 
}
 

}
