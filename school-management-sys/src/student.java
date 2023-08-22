import java.util.Scanner;

/**
 * Ask the user how many new students will be enrolled at the institution to be added on the database
 * keep track of the student's fees, name, ID and subject
 **/

public class student {

    private String firstName;
    private String course;
    private String lastName;
    private String tuitionBalance;
    private int courseCost = 800;
    private String gradeLevel;
    private static int id = 100;
    private String StudentID;

    //constructor prompt user to enter student's name and year
    public  student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name :");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name :");
        this.lastName = in.nextLine();

        System.out.println("Enter student class level: \n1 - First year\n2 - Second year\n3 - Senior");
        this.gradeLevel = in.nextLine();
        setStudentID();

        System.out.println(firstName + " " + lastName + " " + gradeLevel + " " + StudentID);


//        System.out.println("Enter graduation year :");
//        this.gradeYear = in.nextLine();

    }
        //student ID
    private void setStudentID(){
        id++;
        this.StudentID = gradeLevel + " " + id;
    }



}
