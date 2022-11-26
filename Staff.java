package University;

/**
 * Program name: Lab3.University
 * Author: Roksana K
 * Version date: 18/11/2022
 * Program info:
 **/
public class Staff extends Member {

   //variables

   static int nextUniqueID = 100001;
   int staffID;
   String jobTitle, room;
   double salary;;

   // returns staff
   protected String getStatus() {
      return("Staff");
   }//getStatus

   //default constructor
   public Staff(){
      super();
      nextUniqueID = nextUniqueID + 1;
   }//Staff

   //alt constructor full
   public Staff(String staffName, String staffEmail, String sJobTitle, String sRoom, double sSalary){
      name  = staffName;
      email = staffEmail;
      jobTitle = sJobTitle;
      room = sRoom;
      salary = sSalary;
      nextUniqueID = nextUniqueID + 1;
   }//staff

   //alt constructor 2
   public Staff(String staffName, String staffEmail){
      name = staffName;
      email = staffEmail;
      jobTitle ="";
      room = "";
      salary = 0;
      nextUniqueID = nextUniqueID + 1;
   }//staff

   //returns number of staff
   protected static int numberOfStaff(){
      return(nextUniqueID - 100001 );
   }//numberOfStudents

   //set + get job title
   protected void setJobTitle(String staffJobTitle){
      jobTitle = staffJobTitle;
   }//set
   protected String getJobTitle(){
      return jobTitle;
   }//get

   //set + get room
   protected void setRoom(String staffRoom){
      room = staffRoom;
   }//set
   protected String getRoom(){
      return room;
   }//get

   //set + get salary
   protected void setSalary(double staffSalary){
      salary = staffSalary;
   }//set
   protected double getSalary(){
      return salary;
   }//get

}//class
