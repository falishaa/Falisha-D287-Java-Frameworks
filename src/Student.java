public class Student{
    private String studentID;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int[] grades;
}

//Constructor
public Student(String stuentID, String firstName, String lastName, String email, int age, int[] grades){
    this.studentID = studentID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = emaill;
    this.age = age;
    this.grades = grades;
}

//Getters & Setters
public String getStudentID(){
    return studentID;
}

public void setStudentID(String studentID){
    this.studentID = studentID;
}

