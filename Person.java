/*
Registration System
Date: December 3rd, 2021
Author: Oscar Chavez
Purpose: Assignment 2
*/
public class Person {
   private String   name;

   public Person(String initialName)
   {
      name = initialName;
   }
   
   public Person(){}
   
   public void setName( String fullName)
   {
      name = fullName;  /* set for name*/
   }

   public String getName()
   {
      return name;  /* get for name*/
   }
 
   public String toString()
   {
      System.out.println("Name is: " + name);  /*print name*/

   return null;
   }
}
