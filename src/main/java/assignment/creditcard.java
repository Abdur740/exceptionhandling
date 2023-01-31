package assignment;
import java.util.Scanner;
import java.util.logging.Logger;

class Crddeatils implements Cloneable{
    String cardholdername;
    long cardnumber;
    String expidate;


    Crddeatils(String cardholdername, long cardnumber, String expidate)
    {
        this.cardholdername= cardholdername;
        this.cardnumber = cardnumber;
        this.expidate = expidate;
    }
    boolean checkequals(long newcardnumber)
    {

        return cardnumber == newcardnumber;
    }

    public Object clone() throws  CloneNotSupportedException
    {
        return  super.clone();
    }
}
public class CREDITCARD {

    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args) throws CloneNotSupportedException{
        try{
        String cardholdername;
        long cardnumber;
        String expidate;
        long newcardnumber;

        Scanner input=new Scanner(System.in);
        LOGGER.info("Enter Card Holder name:");
        cardholdername=input.nextLine();
        LOGGER.info("Enter Card number: ");
        cardnumber=input.nextLong();
        LOGGER.info("Enter Expiration date:");
        expidate=input.next();
        Crddeatils cd=new Crddeatils(cardholdername, cardnumber, expidate);
        Crddeatils cdclone=(Crddeatils)cd.clone();
        LOGGER.info("Enter New card number: ");
        newcardnumber=input.nextLong();
        Boolean t=cd.checkequals(newcardnumber);
        String res=String.valueOf(t);
        LOGGER.info(res);
        cdclone.cardnumber = newcardnumber;
        LOGGER.info("Card updated successfully.");
        String print ="Updated Card number: "+cdclone.cardnumber; 
        LOGGER.info(print);
        String print1 ="Card holder name : "+cd.cardholdername;
        LOGGER.info(print1);
        String print2 ="Expiration date : "+cd.expidate;
        LOGGER.info(print2);
        }catch(Exception e){
            String print = ""+e;
            LOGGER.info(print);
        }

    }
}
