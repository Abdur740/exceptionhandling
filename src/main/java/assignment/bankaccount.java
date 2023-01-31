package assignment;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

class SimpleBankAcc{
    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    Scanner sc = new Scanner(System.in);
    String userName;
    long accNumber;
    double balance;

    SimpleBankAcc(){
        LOGGER.log(Level.INFO,"Enter user name: ");
        userName = sc.nextLine();
        LOGGER.log(Level.INFO,"Enter account number: ");
        accNumber = sc.nextLong();
    }
    void deposit(){
        LOGGER.log(Level.INFO,"Enter amount to deposit: ");
        double amt = sc.nextDouble();
        LOGGER.log(Level.INFO,Double.toString(amt),"Amount credited: "+amt+" INR");
        balance += amt;
    }
    void withdrawal(){
        LOGGER.log(Level.INFO,"Enter amount to withdraw: ");
        double withdrawAmt = sc.nextDouble();
        String x = "Amount withdrawed :"+withdrawAmt;
        LOGGER.info(x);
        if(withdrawAmt < balance){
            balance-=withdrawAmt;
            String x1 = "Your current balance: "+balance;
            LOGGER.info(x1); 
        }
        else
        {
            LOGGER.log(Level.INFO,"Insufficient funds, try again.");
        }
    }
    void checkBalance(){
        LOGGER.log(Level.INFO,"Your balance is "+balance+" INR");
    }
}
public class BANKACCOUNT {
    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) {
       SimpleBankAcc user = new SimpleBankAcc();
       int option;
       Scanner sc = null;
       try{ 
       do{
            LOGGER.log(Level.INFO,"1. Deposit\n2. Withdrawal\n3. Check balance\n4. Cancel");
            LOGGER.log(Level.INFO,"Select Option: ");
            
            sc = new Scanner(System.in);
            option = sc.nextInt();
            if(option <4 || option >4){
            switch (option){
                case 1: user.deposit();
                break;
                case 2: user.withdrawal();
                break;
                case 3: user.checkBalance();
                break;
                default:
                LOGGER.log(Level.WARNING, "Invalid");
                break;
                }
            }
        }while(option!=4);
        LOGGER.log(Level.INFO,"Thank you for banking with us!");
        }catch(Exception e){
            String print = ""+e;
            LOGGER.info(print);
        }finally{
            if(sc !=null){
                sc.close();
            }
        }
    }  
}
