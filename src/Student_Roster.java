import java.util.ArrayList;

public class Student_Roster{
    ArrayList<Student> classRosterList = new ArrayList<>();
}

public void add(String studentID, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3){
    int[] grades = {grade1, grade2, grade3};

    Student student = new Student(studentID, firstName, lastName, email, age, grades);

    classRosterList.add(student);
}

public void remove(String studentID){
    for(Student student : classRosterList){
        if(student.getStudentID().equals(studentID)){
            classRosterList.remove(student);
            System.out.println("Student removed!");
            return;
        }
    }
    System.out.println("Student with ID: " + studentID + " was not found!");
}

public void print_all(){
    for(Student student : classRosterList){
        student.print();
    }
}

public void print_average_grade(String studentID){

}

public void print_invalid_emails(){

}