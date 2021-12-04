/*
Registration System
Date: December 3rd, 2021
Author: Oscar Chavez
Purpose: Assignment 2
*/
import java.util.HashSet;
import java.util.Vector;

public class Department {
   private String name; // the name of school Dept of Computing and Info Science
   private String id; // short name for courses SOFE, ELEE, STAT, etc
   private Vector<Course> courseList; // all courses offered by the department
   private Vector<Student> registerList; // all students taking courses in the department.

   
   public Department(String name, String id)
   {
	      // also initialize the vectors
      Vector<Course>courseList = new Vector<Course>();   /*store list of courses*/
      Vector<Student>registerList = new Vector<Student>();  /* store list of students*/
   }

   public String getName()
   {
      return name;	  /*get name*/
   }

   public String getId()
   {
      return id;   /* get ID*/
   }
   
 	
   public String toString() {
      // returns a string representation of department name, number 
      // of courses offered and number of students registered in the
      // department. Use the format:
      // ECSE: 53 courses, 460 students

      System.out.println("Department: " + name + " " + id);
      System.out.println(courseList.size() + "courses, " + registerList.size() + "students");
      return null;
   }

   public void AddCourse(Course course)
   {
      courseList.add(course);
   }

   public void ShowCourses()  /*method to show info about each course in dept*/
   {
      for(int i = 0; i < courseList.size(); i++)
      {
         courseList.elementAt(i).toString();
      }
   }

   public void addStudentToRegister(Student lst)
   {
      if(isStudentRegistered(lst))
      {
         registerList.add(lst);  /*add student to vector if not already on it*/
      }
   }

   public boolean isStudentRegistered(Student lst) /*return if student is in course in the dept*/
   {
      return(registerList.contains(lst));  /*true if student is in vector*/
   }

   public Vector<Student>studentsInCourse(int code)  /*return classList if course is in dept*/
   {
      Vector<Student>studentsInCourse = new Vector<Student>();
      boolean included = false;
      for(int i = 0; i < courseList.size();i++)
      {
         if(code==((courseList.elementAt(i))).getCode())  /*if course is found*/
         {
            studentsInCourse =(courseList.elementAt(i)).getClassList(); /*make course list the same as studnets in course*/
            included = true;
            break;
         }
      }
      if(included)  /*if course is found*/
      {
         return studentsInCourse;  /*show vector*/
      }
      else
      {
         System.out.println("Course not part of department");
      }
      return null;
   }

   public void StudentsInCourse(int code)
   {
      System.out.println("Students in " + id + code);
      int r,s;
      Vector<Student>courseStudents = studentsInCourse(code); /*get vector with students in course*/
      s = courseStudents.size();
      Vector<Student>copy = new Vector<Student>(s);  /*vector for students already found*/

      for (int i=0; i<s; i++)
      {
         copy.add(courseStudents.elementAt(s)); /*add to previous vector*/
         (courseStudents.elementAt(s)).toString(); /*show info*/

      }
   }



}
