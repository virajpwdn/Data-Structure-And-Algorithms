package Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount user = new BankAccount(5000000);
        // user.balance = 200;
        // System.out.println(user.getBalance());
        Credit cc = new Credit();
        cc.balance = 120.1;
        // cc.creditScore = 10;
        // System.out.println(cc.creditScore);
        System.out.println(cc.balance);

        System.out.println(cc instanceof BankAccount);
        System.out.println(user.getClass());
    }
}
