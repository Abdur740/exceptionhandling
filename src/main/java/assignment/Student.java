// 3. Design a class for a student at a school. The class should have the following features:
//- Instance variables for the student's name, grade level, and GPA.
//- A constructor that allows the user to create a student with a given name, grade level, and GPA.
//- A method that allows the user to update the student's GPA.
//- A method that returns the student's name and GPA as a string (e.g. ""John Doe has a 3.5 GPA"")."


package assignment;
import java.util.Scanner;
import java.util.logging.Logger;

class GPA{
    public static final Logger LOGGER = Logger.getLogger("InfoLogging");
    String name;
    String gradeLevel;
    double gpa1;

    GPA(){
        Scanner sc = new Scanner(System.in);
        LOGGER.info("Enter student name: ");
        name = sc.nextLine();
        LOGGER.info("Enter Student grade: ");
        gradeLevel = sc.nextLine();
        LOGGER.info("Enter GPA: ");
        gpa1 = sc.nextDouble();
        
    }
    String display(){
        return name+" has a "+gpa1+" GPA.";
    }
    void update(){
        Scanner sc = new Scanner(System.in);
        LOGGER.info("Enter new GPA: ");
        double newGPA = sc.nextDouble();        
        gpa1 = newGPA;
        LOGGER.info("Update successful.");
        String display = display();
        LOGGER.info(display);
    }
    void checkrecord(){
        Scanner sc =  new Scanner(System.in);
        while(true){
            LOGGER.info("Enter username: ");
            String userName = sc.nextLine();
        if (userName.equals(name)){
            update();
            break;
        }
        else{
            LOGGER.info("Invalid username, try again...");
        }
    }
    }
    
}
public class Student{
    public static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        try{
        Scanner sc =  new Scanner(System.in);
        GPA student1 = new GPA();
        LOGGER.info("Do you want to update your GPA (y/n): ");
        char choice;
        choice = sc.next().charAt(0);
        String str = "Canceled. Your current GPA is " +student1.gpa1;
        if(choice== 'y' || choice =='n'){
            if(choice =='y'){
            student1.checkrecord();
            }
            else if(choice =='n'){
                LOGGER.info(str);
            }
        }
        else{
            LOGGER.info("Invalid input. choose (y/n), try again...");
        }
       }catch(Exception e){
            String print = ""+e;
            LOGGER.info(print);
       }
}
}