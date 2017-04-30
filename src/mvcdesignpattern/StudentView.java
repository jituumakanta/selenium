package mvcdesignpattern;

/**
 * Created by jitu on 4/30/2017.
 */
//VIEW CLASS
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
