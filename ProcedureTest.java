/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.patientcharges;
import java.util.Date;
/**
 *
 * @author BGeo1
 */
public class ProcedureTest {
    public static void main(String[] args) 
    {
     String newLine = System.getProperty("line.separator");

 Procedure list = new Procedure();
 
      list.setprocedureOne("Physical Exam");
      list.setdateProcedureOne(new Date());
      list.setpractitionerOne("Dr. Irvine");
      list.setchargeOne(250.00);
      
      list.setprocedureTwo("X-Ray");
      list.setdateProcedureTwo(new Date());
      list.setpractitionerTwo("Dr. Jamison" );
      list.setchargeTwo(500.00);
      
      list.setprocedureThree("X-Ray");
      list.setdateProcedureThree(new Date());
      list.setpractitionerThree("Dr. Irvine");
      list.setchargeThree(200.00);
          
      System.out.println();
 System.out.println("Procedure#1: " + list.getprocedureOne()+ newLine + 
         "Date of Procedure:" + list.getdateProcedureOne() + newLine + 
         "Practicioner: " + list.getpractitionerOne() + newLine + 
         "Charge: " + list.getchargeOne());

 
System.out.println("Procedure#2: " + list.getprocedureTwo()+ newLine + 
         "Date of Procedure:" + list.getdateProcedureTwo() + newLine + 
         "Practicioner: " + list.getpractitionerTwo() + newLine + 
         "Charge: " + list.getchargeTwo());

      
System.out.println("Procedure#3: " + list.getprocedureThree()+ newLine + 
         "Date of Procedure:" + list.getdateProcedureThree() + newLine + 
         "Practicioner: " + list.getpractitionerThree() + newLine + 
         "Charge: " + list.getchargeThree());
 
 }
}
//String procedureOne;
//String procedureTwo;
//String procedureThree;
 
//Date dateProcedureOne;
//Date dateProcedureTwo;
//Date dateProcedureThree;

//String practitionerOne;
//String practitionerTwo;
//String practitionerThree;


 //double chargeOne; 
 //double chargeTwo;
 //double chargeThree;