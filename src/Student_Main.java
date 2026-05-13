public class Student_Main{
    public static void main(String[] args){
        //declare array from scenario
        String[] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
        "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
        "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
        "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
        "5,Falisha,Quayum,fquayu1@wgu.edu,21,90,80,85"};

        //create roster object
        Student_Roster classRoster = new Student_Roster();

        //run methods
        //add() method
        for(String studentData : students){ //loop thru all students in array
            String[] parts = studentData.split(",");
            //add to array
            classRoster.add(parts[0], parts[1], parts[2], parts[3], Integer.parseInt(parts[4]), Integer.parseInt(parts[5]), Integer.parseInt(parts[6]), Integer.parseInt(parts[7]));
        }

        //print_all() method
        System.out.println("Displaying all students:");
        classRoster.print_all();

        System.out.println();

        //print_invalid_emails() method
        System.out.println("Displaying any invalid emails:");
        classRoster.print_invalid_emails();

        System.out.println();

        //print_average_grade() method
        System.out.println("Displaying average grades:");

        for(Student student : classRoster.classRosterList){
            classRoster.print_average_grade(student.getStudentID());
        }

        System.out.println();

        //remove() methods
        System.out.println("Removing Student 3:");
        classRoster.remove("3");

        System.out.println("Removing Student 3 again:");
        classRoster.remove("3");
        
        
    }
}