import java.util.Arrays;
import java.util.Scanner;

public class StuMgtConsole {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("------Student Management System ------");
        System.out.println();

        Student[] student = new Student[10];
        Student std = new Student();

        for(int i=0;i<student.length; i++){
            System.out.println("Enter name for student "+(i+1) + " : ");
            std.name = scan.next();
            System.out.println("Enter age for student "+(i+1) + " : ");
            std.age = scan.nextInt();
            System.out.println("Enter address for student "+(i+1) + " : ");
            std.address = scan.next();
            System.out.println("Enter marks for student "+(i+1) + " : ");
            std.mark = scan.nextInt();

            student[i] = std;
        }

        for(Student student1: student){
            System.out.println("Name: " + student1.name + "," + "Age: " + student1.age + "," + "Address: " + student1.address + "," + "Mark: " + student1.mark);
        }


    }
}
