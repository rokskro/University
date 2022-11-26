package University;
import java.util.Scanner;

public class TestMember {
    public static void main(String[] args){
        //formatting
        Scanner keyboard = new Scanner(System.in);

        //variables
        String name, email, job, room;
        double pay;

        //create staff1
        Staff staff1 = new Staff("George McMullan", "g.mcmullan@ulster.ac.uk", "Lecturer" , "F34", 30000);

        //create staff2
        Staff staff2 = new Staff("James Hollinger", "j.hollinger@ulster.ac.uk");

        //create staff3
        System.out.println("Please enter details for new member of staff:");
        System.out.println("Staff name: ");
        name = keyboard.nextLine();
        System.out.println("Staff email: ");
        email = keyboard.nextLine();
        System.out.println("Staff Job Title: ");
        job = keyboard.nextLine();
        System.out.println("Staff room: ");
        room = keyboard.nextLine();
        System.out.println("Staff Salary: ");
        pay = keyboard.nextDouble();

        Staff staff3 = new Staff(name, email, job, room, pay);

        //print out staff details
        System.out.println(staff1);
        System.out.println(staff2);
        System.out.println(staff3);

        //print out number of staff
        System.out.println("Number of staff: " + Staff.numberOfStaff());

        //create student1
        Student student1 = new Student("Fred Johnston", "johnston-f@ulster.ac.uk", "Computing", 56, 67, 44);

        //create student2
        Student student2 = new Student("Jane Robinson", "robinson.j6@ulster.ac.uk", "Media Studies");

        //print out student details
        System.out.println(student1);
        System.out.println(student2);

        //print out number of students
        System.out.println("Number of students: " + Student.numberOfStudents());

        //setting marks student2
        student2.setMarks(80,75,77);
        System.out.println(student2);

        //change marks student1
        student1.setMark2(76);
        System.out.println(student1);

        //set salary
        staff2.setSalary(45000);

        //print out staff
        System.out.println(staff2);
        System.out.println(staff3);


    }//main
}
