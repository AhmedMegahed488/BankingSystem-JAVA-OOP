import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choose=0; //random number
        int accountID;
        double amount;
        int tempAccountID=0;
        String currencyType;
        List<Account> myObjects = new ArrayList<>();
        Deposit d =new Deposit();
        Withdraw w=new Withdraw();
        BalanceInquiry balanceInquiry=new BalanceInquiry();

        while(choose!=6)
        {
            System.out.println("Press 1 to enter account details");
            System.out.println("Press 2 to deposit");
            System.out.println("Press 3 to withdraw");
            System.out.println("Press 4 to show current balance");
            System.out.println("Press 5 to cancel last transaction");
            System.out.println("Press 6 to exit");

            Scanner input = new Scanner(System.in);
            choose=input.nextInt();
            switch (choose)
            {
                //-----------------------------------------------------------------
                case 1:
                    System.out.print("Enter Account Number : " );
                    accountID=input.nextInt();
                    for (Account obj : myObjects){
                        if (obj.accountNumber==accountID) {
                            System.out.println("this number is actually found");
                            tempAccountID=1;
                            break;
                        }
                    }
                    if(tempAccountID==1)
                    {
                        tempAccountID=0;
                        break;
                    }
                    else {
                        System.out.print("Enter Your Name : " );
                        String name=input.next();
                        System.out.print("enter Your Balance : " );
                        double balance=input.nextDouble();
                        myObjects.add(new Account(accountID,name,balance));
                        break;
                    }

                //-----------------------------------------------------------------
                case 2:
                    System.out.println("Enter Account Number :");
                    accountID=input.nextInt();
                    for (Account obj : myObjects){
                        if (obj.accountNumber==accountID) {
                            tempAccountID=1;
                            break;
                        }
                    }
                    if(tempAccountID==1)
                    {
                        for (Account obj : myObjects) {
                            if (obj.accountNumber==accountID) {
                                System.out.println("Enter the amount of Deposit");
                                amount=input.nextDouble();
                                d.amount=amount;
                                System.out.print("The current balance is "+d.execute(obj));
                                System.out.println();
                                obj.transactionId=1;
                                break;
                            }
                        }
                        tempAccountID=0;
                        break;
                    }
                    else{
                        System.out.println("this account is not found");
                        break;
                    }

                //---------------------------------------------------------------------
                case 3:
                    System.out.println("Enter Account Number :");
                    accountID=input.nextInt();
                    for (Account obj : myObjects){
                        if (obj.accountNumber==accountID) {
                            tempAccountID=1;
                            break;
                        }
                    }

                    if(tempAccountID==1)
                    {
                        for (Account obj : myObjects) {
                            if (obj.accountNumber==accountID) {
                                System.out.println("Enter the amount of Withdraw");
                                amount=input.nextDouble();
                                w.amount=amount;
                                System.out.print("The current balance is "+w.execute(obj));
                                System.out.println();
                                obj.transactionId=0;
                                break;
                            }
                        }
                        tempAccountID=0;
                        break;
                    }
                    else{
                        System.out.println("this account is not found");
                        break;
                    }
                //-----------------------------------------------------------------------
                case 4:
                    System.out.println("Enter Account Number :");
                    accountID=input.nextInt();
                    for (Account obj : myObjects){
                        if (obj.accountNumber==accountID) {
                            tempAccountID=1;
                            break;
                        }
                    }

                    if(tempAccountID==1)
                    {
                        for (Account obj : myObjects) {
                            if (obj.accountNumber==accountID) {
                                System.out.println("enter currency type for show your balance U or E : ");
                                currencyType=input.next();
                                balanceInquiry.currencyType=currencyType;
                                System.out.println("the current balance = "+balanceInquiry.execute(obj));
                                break;
                            }
                        }
                        tempAccountID=0;
                        break;
                    }
                    else{
                        System.out.println("this account is not found");
                        break;
                    }
                //-------------------------------------------------------------------------
                case 5:
                    System.out.println("Enter Account Number :");
                    accountID=input.nextInt();
                    for (Account obj : myObjects){
                        if (obj.accountNumber==accountID) {
                            tempAccountID=1;
                            break;
                        }
                    }

                    if(tempAccountID==1)
                    {
                        for (Account obj : myObjects) {
                            if (obj.accountNumber==accountID) {
                                if(obj.transactionId==1)
                                {
                                    System.out.println("the current balance = "+d.cancelTransaction(obj));
                                }
                                else{
                                    System.out.println("the current balance = "+w.cancelTransaction(obj));
                                }
                                break;
                            }
                        }
                        tempAccountID=0;
                        break;
                    }
                    else{
                        System.out.println("this account is not found");
                        break;
                    }
            }

        }
      }
    }