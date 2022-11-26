package University;

/**
 * Program name: Lab3.University
 * Author: Roksana K
 * Version date: 18/11/2022
 * Program info:
 **/
abstract public class Member
{
   //variables
    String name, email;

   //default constructor
   public Member(){
   }//Member

   //constructor to assign values
   public Member(String mName, String mEmail){
      name = mName;
      email = mEmail;
   }//member

   //set + get name
   protected void setName(String mName){
      name = mName;
   }//setName
   protected String getName() {
      return name;
   }//getName

   //set + get email
   protected void setEmail(String mEmail){
      email = mEmail;
   }//setEmail
   protected String getEmail() {
      return email;
   }//getEmail

   public String toString(){
      return "Name:    " + name + "\n" + "Email:    " + email + "\n";
   }//toString


   //returns string from subclasses
   abstract protected String getStatus();



}//class
