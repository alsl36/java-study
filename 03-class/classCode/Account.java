package classCode;

public class Account {
    
    String accountNumber;
    String name;
    int balance;  
    final int Min_BALANCE = 0;

    public int deposit(int amount) {
        balance = (amount > Min_BALANCE) ? balance+amount : balance;
        return balance;
    }

    public int withdrawal(int amount) {
        if (balance >= amount) {
            balance-=amount;
            return balance;
        } else {
            return -1;
        }

    }

}
