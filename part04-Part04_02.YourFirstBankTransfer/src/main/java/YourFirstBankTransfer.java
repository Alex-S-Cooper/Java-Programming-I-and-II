
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account accoutOfMatt = new Account("Matthews account", 1000.0);
        accoutOfMatt.withdrawal(100);
        Account myAccount = new Account("My account", 0.0);
        myAccount.deposit(100);
 
        System.out.println(accoutOfMatt);
        System.out.println(myAccount);
    }
}
