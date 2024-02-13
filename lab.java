import java.util.*;
class student{
    String student_name;
    int student_roll;
    int student_fee;
    String student_name1;
    int student_roll1;
    int student_fee1;
    student ( String student_name , int student_roll , int student_fee ){
    this.student_name = student_name;
    this.student_roll = student_roll;
    this.student_fee = student_fee;
    
}

void display(){
    System.out.println(this.student_name + " " + this.student_roll +" "+ this.student_fee + " ");
}
}

public class  lab{
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        System.out.println("enter your NAME ");
        String NAME = sc.next();

        System.out.println("enter rollno");
        int rollno = sc.nextInt();
        System.out.println("enter fee");
        int fee = sc.nextInt();

        student s1 = new student(NAME , rollno , fee);
        s1.display();

       
        System.out.println("enter your NAME1 ");
        String NAME1 = sc.next();

        System.out.println("enter rollno1");
        int rollno1 = sc.nextInt();
        System.out.println("enter fee1");
        int fee1 = sc.nextInt();
        student s2 = new student(NAME1, rollno1, fee1);
        s2.display();
    }

        

}

 

