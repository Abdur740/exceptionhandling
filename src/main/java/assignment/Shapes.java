package assignment;

import java.util.Scanner;
import java.util.logging.Logger;

abstract class DIMENSIONS
{
    abstract  void area();
    abstract  void perimeter();
    double result1;

    double result2;
    Scanner sc=new Scanner(System.in);
    public static final Logger LOGGER = Logger.getLogger("InfoLogging");
}

class Triangle extends DIMENSIONS
{
    double h;
    double b;

    double a;
    double c;

    double calc;
    Triangle()
    {

        LOGGER.info("Enter height:");
        h=sc.nextDouble();
        LOGGER.info("Enter base:");
        b=sc.nextDouble();
        LOGGER.info("Enter side1 length:");
        a=sc.nextDouble();
        LOGGER.info("Enter side2 length:");
        c=sc.nextDouble();
    }
    public void area()
    {
        calc=h*b;
        result2=((calc)/2.0);
        String print ="Area of triangle :"+result2;
        LOGGER.info(print);
    }
    public void perimeter() {

        result1=(a+b+c);
        String print ="Perimeter of triangle :"+result1;
        LOGGER.info(print);
    }
}
class Rectangle extends DIMENSIONS
{
    double l;
    double w;
Rectangle()
    {
        LOGGER.info("Enter length:");
        l=sc.nextInt();
        LOGGER.info("Enter width:");
        w=sc.nextInt();
    }

    public void area() {
        result2=(l*w);
        String print ="Area of rectangle : "+result2;
        LOGGER.info(print);

    }


    public void perimeter() {
        result1=(2*(l*w));
        String print ="Perimeter of rectangle :"+result1;
        LOGGER.info(print);
    }
}
class Circle extends DIMENSIONS
{
    double r;
    Circle()
    {
        LOGGER.info("Enter radius of the circle:");
        r=sc.nextDouble();
    }

    public void area()
    {
        result2=((3.1415)*(r*r));
        String print ="Area of circle :"+result2;
        LOGGER.info(print);
    }
    public void perimeter() {
        result1=((2*3.1415)*r);
        String print ="Perimeter of circle :"+result1;
        LOGGER.info(print);
    }
}
public class Shapes {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        try{
        int option;
        Scanner sc=new Scanner(System.in);
        do{
        LOGGER.info("Select any one of the shapes\n1. Triangle\n2. Rectangle\n3. Circle\n4. Exit");   
        option = sc.nextInt();
        switch(option){
            case 1:
            LOGGER.info("Enter dimensions for Triangle");
            Triangle t1=new Triangle();
            t1.perimeter();
            t1.area();
            break;
            case 2:
            LOGGER.info("Enter dimensions for  Rectangle");
            Rectangle r1=new Rectangle();
            r1.perimeter();
            r1.area();
            break;
            case 3:
            LOGGER.info("Enter dimensions for  circle");
            Circle c1=new Circle();
            c1.perimeter();
            c1.area();
            break;
            case 4:
            LOGGER.info("Exit");
            break;
            default:
            LOGGER.info("Please enter a valid dimensions.");
            break;
        }
        }while(option!=4);
        }
        catch(Exception e){
            String print = ""+e;
            LOGGER.info(print);
    }
    }
}
