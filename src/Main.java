
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher tony = new Teacher(2,"Tony",700);
        Teacher jill = new Teacher(3,"Jill",600);

 //add teachers to the Teacher list

        List<Teacher> teacherList = new ArrayList<>();
        
        teacherList.add(lizzy);
        teacherList.add(tony);
        teacherList.add(jill);

//add students to the student list        
        
    List<Student> studentList = new ArrayList<>();
        
        Student kate = new Student(1,"Kate",4);
        Student harry = new Student(2,"Harry",12);
        Student piki = new Student(3,"Piki",5);
       

        studentList.add(kate);
        studentList.add(piki);
        studentList.add(harry);
        
        School cft = new School (teacherList, studentList);
        System.out.println("CFT has earned $" + cft.getTotalMoneyEarned());

        kate.payFees(5000);
        piki.payFees(6000);
        System.out.println("CFT has earned " + cft.getTotalMoneyEarned());

        Teacher.receiveSalary(lizzy.getSalary());

        System.out.println("CFT has spent for salary to " + lizzy.getName() + " and now has " + cft.getTotalMoneyEarned());

        Teacher.receiveSalary(tony.getSalary());
        System.out.println("CFT has spent for salary to " + lizzy.getName() + " and now has " + cft.getTotalMoneyEarned());

        System.out.println(kate);
 

    }}
