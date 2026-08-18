package classCode;

public class BankApplication {
    
    Account[] accountList = new Account[100];
    int num=0;

    public void newAccount(String accountNumber, String name, int amount) {
        accountList[num] = new Account();
        accountList[num].accountNumber = accountNumber;
        accountList[num].name = name;
        accountList[num].deposit(amount);
        num++;
    }

    public void showList() {
        System.out.println("-----------");
        System.out.println("계좌목록");
        System.out.println("-----------");

        for (int i=0; i<=num-1; i++) {
            System.out.printf("%s   %s   %d\n", accountList[i].accountNumber, accountList[i].name, accountList[i].balance);
        }
    }

    public void deposit(String accountNumber, int amount) {
        for (int i=0; i<=num-1; i++) {
            if (accountList[i].accountNumber.equals(accountNumber)) {
                accountList[i].deposit(amount);
            }
        }
    }

    public void withdrawal(String accountNumber, int amount) {
        for (int i=0; i<=num-1; i++) {
            if (accountList[i].accountNumber.equals(accountNumber)) {
                accountList[i].withdrawal(amount);
            }
        }
    }
}
