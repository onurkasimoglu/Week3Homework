package Week3Homework;

// Inheritance sample, Mother: User, Child1: Student
public class Student extends User {
    // specific property of Student Class
    String email;

    //Method overriding for Student
    public void satisfactionSurvey() {
        String surveyresult = "I am glad to learn the fundamentals of coding in Kodlama.io";
        SurveyResult();
        System.out.println(surveyresult);

    }

}