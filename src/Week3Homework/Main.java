package Week3Homework;

public class Main {

    public static void main(String[] args) {

        // Instructor info entering
        Instructor instructor = new Instructor();
        instructor.name = "Martin";
        instructor.id = 10002;
        instructor.surname = "May";

        // Student info entering
        Student student = new Student();
        student.name = "Markus";
        student.id = 10001;
        student.surname = "Wick";

        // Method overloading sample
        UserManager userManager = new UserManager(instructor);
        userManager.showInformation();
        userManager.showInformation(student);

        // Polymorphism sample
        User[] users = new User[]{student, instructor};
        for (User u : users) {
            System.out.println(u.name + ":");
            u.satisfactionSurvey();
        }


    }
}
