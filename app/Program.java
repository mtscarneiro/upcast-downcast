package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Account acc = new Account(1001, "Alex", 0.0);
        BussinessAccount bacc = new BussinessAccount(1002, "Maria", 0.0, 500.0);

        //upcasting

        Account acc1 = bacc;
        acc1.getBalance();
        Account acc2 = new BussinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004,"Ana", 0.0, 0.01);

        //downcasting

        BussinessAccount acc4 = (BussinessAccount)acc2;
        acc4.loan(100.0);

        /* Erro porque o acc3 eh um savingsaccount e nao um Account.
        BussinessAccount acc5 = (BussinessAccount)acc3;
        */

        if (acc3 instanceof BussinessAccount){
            BussinessAccount acc5 = (BussinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }




        input.close();
    }
    
}
