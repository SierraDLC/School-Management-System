

import java.util.List;

/**
 *  A school has many teachers and students. We have to account for this.
 * We have to create an Array List
*/ 
//Teacher and Student are the Classes
//teachers and students are list names
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;
    


/**
 * create new objects for the teachers list and students
 */

 public School(List<Teacher> teachers, List<Student> students) { 
      this.teachers = teachers;
      this.students = students;

      totalMoneyEarned = 0;
      totalMoneySpent = 0;
 }

 /**
  * because these items can or will change, we will use Getters & Setters for everything. 
  * 
  */

//returns list of teachers
public List<Teacher> getTeachers() {
    return teachers;
}


//this teacher object is coming from the teacher class. It adds a teacher to the school
public void addTeachers(Teacher teacher) {
    teachers.add(teacher);
}



 public List<Student> getStudents() {
    return students;
}



public void addStudents(Student student) {
    students.add(student);
}



public int getTotalMoneyEarned() {
    return totalMoneyEarned;
}


/**
 * adds total money earned to the parameter MoneyEarned
 * @param MoneyEarned money that is to be added
 */

 public static void updateTotalMoneyEarned(int MoneyEarned) {
   totalMoneyEarned += MoneyEarned;
}



public int getTotalMoneySpent() {
    return totalMoneySpent;
}

/**
 * update money spent by the school for teacher's salary.
 * @param MoneySpent
 */

public static void updateTotalMoneySpent(int moneySpent) {
    totalMoneyEarned -= moneySpent;
  
}


 

 
} 