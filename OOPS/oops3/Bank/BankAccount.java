package Bank;

public class BankAccount {
     protected double balance;

    // getter
    double getBalance(){
        return balance;
    }

    // setter
    BankAccount(double data){
        this.balance = data;
    }
    BankAccount(){
        System.out.println("Hello User");
    }
}
