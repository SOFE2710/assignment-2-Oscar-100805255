/*
Registration System
Date: December 3rd, 2021
Author: Oscar Chavez
Purpose: Assignment 2
*/
import java.util.Vector;
public class Course{
   private Department dept;
   private String title; // title of the course (e.g. Intro to programming);
   private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
   private int number; // course number, e.g. 1200, 2710, 2800, etc.
   private  Vector <Student>classList; // contains all students registered in this course

   public Course(String code, int number, Department dept, String title)
   {
	      // also initialize the classList;
      Vector <Student>classList = new Vector<Student>(); /*list for students in class*/
	 	   
   }

   public Course()
   {
	// TODO Auto-generated constructor stub
   }

   public int getCode()
   {
      return number;    /*number of course code*/
   }

   public Vector<Student>getClassList()
   {
      return classList;  /*vector of students*/
   }
 
  public String toString() {
     // return a string representation of the course with the course code,
     // name, and number of people registered in the course in the following
     // format:
     // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260

     System.out.println(title);
     System.out.println(code + number);
     System.out.println("Number of students in class: " + classList.size());

     return null;
  }

  public void addToClassList(Student lst)
  {
     classList.add(lst);   /*add students to vector classList*/
  }

  public void addToRegister(Student lst)
  {
     dept.addStudentToRegister(lst);   /*add student to department vector*/
  }

}
