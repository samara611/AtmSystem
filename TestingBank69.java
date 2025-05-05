//tasting bank class#

package Testing;

import java.io.File;
import java.lang.Exception;
import java.io.PrintWriter;
import java.util.*;

public class TestingBank69 {
    static  ArrayList<Accounts>account = new ArrayList<Accounts>();
    static ArrayList<Transactions>transact = new ArrayList<Transactions>();

    //creating account method.
    public static void creatAccount(Accounts accounts){
        account.add(accounts);
        if (account.contains(accounts)) {
            System.out.println("account exists");

        }else {
            System.out.println("successfully added");
            account.add(accounts);

        }




    }
    // text file method.
    public static void printWriter(){
        try{
            File f = new File("/Users/utente/Desktop/s.txt ");
            System.out.println(f.getAbsolutePath());
            PrintWriter print = new PrintWriter(f);
            print.print(account);

            print.close();
        }
        catch(Exception o){
            System.out.println("error: "+ o);
        }
    }


    //the deposit operation method.
    public static double depositmoney(Accounts a,int x){
        if(account.contains(a)){
            System.out.print("Deposit operation ");
            double Deposit=a.getBalance()+x;
            a.setBalance( a.getBalance()+x);
            System.out.print("was successful the amount is ");
        }
        return x;
    }

    //the withdrawal operation method. 

    public static double withdrawalmoney(Accounts a1,int x1){
        if(account.contains(a1)){
            System.out.print("Withdrawal operation ");
            double withdrawal=a1.getBalance()-x1;
            a1.setBalance( a1.getBalance()-x1);
            System.out.print("was successful the amount is ");
        }else{
            System.out.print("was not successful");
        }
        return x1;
    }

    //the transfering between two accounts operation method.

    public static double transfer(Accounts acc, Accounts acc1,int x2){

        System.out.print("Amount of ");

        if (x2 < acc.getBalance()){
            acc.setBalance( acc.getBalance()+x2);
            acc1.setBalance( acc1.getBalance()-x2);
            Transactions a=  new Transfer(acc1);
            transact.add(a);
            System.out.println("transfer money was successful.");
        }else{
            System.out.println("Transfer money could not happen!!");
        }
        if (x2 < acc.getBalance()) {
            System.out.print("Max amount of transfer money between the two account is: ");
        } else{
            System.out.print("transfer money could not happen bec the amount is greater than the balance: ");

        }
        return x2;
    }

    //to string method.
    @Override
    public String toString() {
        return "TestingBank69{" + '}';
    }


}