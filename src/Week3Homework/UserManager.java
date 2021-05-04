package Week3Homework;

public class UserManager {


    // User variable for the method without overloading to get information like name, id, surname
    private User user;
    public UserManager(User user){
        this.user = user;

    }

    // Method overloading without parameter
    public void showInformation() {
        System.out.println("The name of the user:  " + this.user.name);
        System.out.println("User ID:  " + this.user.id);
        System.out.println("the surname of the user:  " + this.user.surname);
        user.recordToSystem();
    }



    // Method overloading with parameter
    public void showInformation(User user) {
        System.out.println("The name of the user:  " + user.name);
        System.out.println("User ID:  " + user.id);
        System.out.println("the surname of the user:  " + user.surname);
        user.recordToSystem();
    }


}