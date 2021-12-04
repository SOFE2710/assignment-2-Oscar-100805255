/*
Registration System
Date: December 3rd, 2021
Author: Oscar Chavez
Purpose: Assignment 2
*/
import java.util.Vector;
public class Student extends Person{
  private String id;
  private String name;
  private Vector courses; // contains all courses the student is registered in

	public Student(String stdName, String stdId)
	{
		super(stdName);   /*parent class call*/

		id = stdId;

		Vector<Course>courses = new Vector<Course>();  /* vector to save courses enrolled*/
	}

  	  public String getName()  /*get name & ID*/
	  {
		  return name;
  	  }

  	  public String getId()
	  {
		  return id;
  	  } 	  

    public String toString() {
     // return a string representation of a student using the following format:
     // 100234546 John McDonald
     // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850

		System.out.println("Student ID: " + id);
		System.out.println(name);
		System.out.println("Courses registered in: ");
		System.out.println(courses);
   
	return null; 
  }

  /* method to add student to course, students registered in course and in each department*/
  public void registerFor(Course course)
  {
	  if(!(courses.contains(course)))  /*check if student is in course*/
	  {
		  courses.add(course);    /*add to student's list*/
		  course.addToClassList(this);       /*add to class list*/
		  course.addToRegister(this);    /*add student to dpeartment*/
	  }
  }

  /*method to check if a student in enrolled in a course*/

	public Boolean isRegisteredInCourse(Course course)
	{
		return courses.contains(course);   /*true if course is found*/
	}
}
