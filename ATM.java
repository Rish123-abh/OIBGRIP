import java.util.*;
public class ATM {
    public static void main(String [] args){
        int password=1940;
        Scanner input= new Scanner(System.in);
        int balance=10000;
        System.out.println("------------Welcome to ATM-------------\n");
        System.out.println("Enter your Account Number");
        int number=input.nextInt(); 
        System.out.println("Enter the Atm Pin");
        int pin=input.nextInt();
        if(pin!=password){
            int i;
            int j=2;
            for(i=0;i<2;i++){
                System.out.println("You have entered the wrong pin\nEnter the correct pin \nYou have" +j+" chances left");
                j--;
                pin=input.nextInt();
                if(pin==password){
                    break;
                }
            }
            if(i==2){
                System.out.println("Try again after sometime");
            }
        } 
        if(pin==password){
            while(true){
                System.out.println("Welcome to ATM interfaces ");
                    System.out.println("1.Check your balance ");
                    System.out.println("2.Withdraw Amount");
                    System.out.println("3.Deposit amount");
                    System.out.println("4.Exit");
                    System.out.println("Select your option");
                    int inputu=input.nextInt();
                    System.out.println("You  have selected "+inputu+" Option");
                    switch(inputu){
                        case 1:
                        System.out.println("Your balance is "+balance+" Rs \n");
                        break;
                        case 2:
                        System.out.println("Enter the amount you want to withdraw ");
                        int withdraw=input.nextInt();
                        if((withdraw>balance)||(balance==0)){
                                System.out.println("Insufficient funds in account");
                        }
                        else{
                            System.out.println("Withdrawl Successful ");
                            balance=balance-withdraw;
                        }
                        break;
                        case 3:
                        System.out.println("Enter The amount you want to deposit ");
                        int deposit=input.nextInt();
                        balance=balance+deposit;
                        break;
                        case 4:
                        System.out.println("ThankYou for using the ATM services!!");
                        System.exit(0);

                    }
            }

            }
        }
    }
