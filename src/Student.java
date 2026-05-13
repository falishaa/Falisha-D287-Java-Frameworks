public class Student{
    private String studentID;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int[] grades;
}

//Constructor
public Student(String studentID, String firstName, String lastName, String email, int age, int[] grades){
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

public String getFirstName(){
    return firstName;
}

public void setFirstName(String firstName){
    this.firstName = firstName;
}

public String getLastName(){
    return lastName;
}

public void setLastName(String lastName){
    this.lastName = lastName;
}

public String getEmail(){
    return email;
}

public void setEmail(String email){
    this.email = email;
}

public int getAge(){
    return age;
}

public void setAge(int age){
    this.age = age;
}

//print method
public void print(){
    System.out.print(studentID + "\t");
    System.out.print("First Name: " + firstName + "\t");
    System.out.print("Last Name: " + lastName + "\t");
    System.out.print("Age: " + age + "\t");
    System.out.print("Grades: ");

    for(int grade : grades){
        System.out.print(grade + " ");
    }

    System.out.println();
}