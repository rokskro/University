package University;

import java.text.DecimalFormat;

/**
 * Program name: Lab3.University
 * Author: Roksana K
 * Version date: 18/11/2022
 * Program info:
 **/
public class Student extends Member {

   //formatting
   DecimalFormat df = new DecimalFormat("0.00");
   //variables
   static int nextUniqueID = 1;
   String course;
   int studentID, mark1, mark2, mark3;

   // returns student
   protected String getStatus() {
      return("Student");
   }//getStatus

   //default constructor
   public Student(){
      super();
      nextUniqueID = nextUniqueID + 1;
   }//Student

   //alt constructor 1
   public Student(String studentName, String studentEmail, String sCourse, int sMark1, int sMark2, int sMark3){
      name = studentName;
      email = studentEmail;
      course = sCourse;
      mark1 = sMark1;
      mark2 = sMark2;
      mark3 = sMark3;
      nextUniqueID = nextUniqueID + 1;
   }//Student

   //alt constructor 2
   public Student(String studentName, String studentEmail, String sCourse){
      name =  studentName;
      email = studentEmail;
      course = sCourse;
      mark1 = -1;
      mark2 = -1;
      mark3 = -1;
      nextUniqueID = nextUniqueID + 1;
   }//Student

   //getID
   protected int getID(){
      return studentID;
   }

   //set + get course
   protected void setCourse(String sCourse){
      course = sCourse;
   }//set
   protected String getCourse(){
      return course;
   }//get

   //set + get mark1
   protected void setMark1(int sMark1){
      mark1 = sMark1;
   }//set
   protected int getMark1(){
      return mark1;
   }//get

   //set + get mark2
   protected void setMark2(int sMark2){
      mark2 = sMark2;
   }//set
   protected int getMark2(){
      return mark2;
   }//get

   //set + get mark3
   protected void setMark3(int sMark3){
      mark3 = sMark3;
   }//set
   protected int getMark3(){
      return mark3;
   }//get

   //set all marks
   protected void setMarks(int sMark1, int sMark2, int sMark3){
      mark1 = sMark1;
      mark2 = sMark2;
      mark3 = sMark3;
   }//setMarks

   private double getAverage(){
      double average;
      average  = (mark1 + mark2 + mark3) / (double) 3;
      return average;
   }//getAverage

   public String toString(){
      String message;
      double result;

      result = getAverage();
      message = ("The Student ID is: " + studentID + "\n" + super.toString() + "Course:     " + getCourse() + "\n"
              + "The students three marks are:\n"
              + "\t\t" + mark1 + "%\n"
              + "\t\t" + mark2 + "%\n"
              + "\t\t" + mark3 + "%\n");

      if (result < 0) {
         message = message + "Average mark not computable";
      }//if
      else {
         message = message + "The average mark of the student is " + df.format(result) + "%\n";
      }//else
      return message;
   }//toString

   //returns number of students
   protected static int numberOfStudents(){
      return(nextUniqueID - 1);
   }//numberOfStudents




}//class
