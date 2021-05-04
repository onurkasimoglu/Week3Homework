package Week3Homework;

public class User {
    // common properties for all classes
    int id;
    String name;
    String surname;

    public void recordToSystem() {
        System.out.println("user is recorded in database");
        System.out.println(" ");
    }

    public void SurveyResult() {
        System.out.println("the result of the survey as followed: ");
    }

    //Method overriding for User
    public void satisfactionSurvey(){

}
}

