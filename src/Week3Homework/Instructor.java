package Week3Homework;

// Inheritance sample, Mother: User, Child1: Instructor
public class Instructor extends User{
    // specific property of Instructor Class
    String Schedule;

   //Method overriding for Instructor
    public void satisfactionSurvey(){
        String surveyresult = "I am glad to work in Kodlama.io";
        SurveyResult();
        System.out.println(surveyresult);

}



}
