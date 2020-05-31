
public class Accounts {

    public static void main(String[] args) {
        int transfer = 100;
        Account matt = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);

        matt.withdrawal(transfer);
        myAccount.deposit(transfer);

        System.out.println(matt.toString());
        System.out.println(myAccount.toString());
    }
}
