package classCode;

import java.util.Scanner;

public class AccountExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int user = 0;

        BankApplication list = new BankApplication();

        while (user!=5) {
            System.out.printf("------------------------------------------------\n");
            System.out.printf("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료\n");
            System.out.printf("------------------------------------------------\n");
            System.out.printf("선택> ");
            user = Integer.parseInt(scanner.nextLine());

            switch(user) {
                case 1 :
                    System.out.printf("-----------\n");
                    System.out.printf("계좌생성\n");
                    System.out.printf("-----------\n");
                    System.out.printf("계좌번호: ");
                    String accountNumber = scanner.nextLine();
                    System.out.printf("\n");
                    System.out.printf("계좌주: ");
                    String name = scanner.nextLine();
                    System.out.printf("\n");
                    System.out.printf("초기입금액: ");
                    int amount = Integer.parseInt(scanner.nextLine());
                    System.out.printf("\n");
                    list.newAccount(accountNumber, name, amount);
                    System.out.println("결과: 계좌가 생성되었습니다.");
                    break;
                case 2 :
                    list.showList();
                    break;
                case 3 :
                    System.out.printf("-----------\n");
                    System.out.printf("예금\n");
                    System.out.printf("-----------\n");
                    System.out.printf("계좌번호: ");
                    String accountNumber2 = scanner.nextLine();
                    System.out.printf("\n");
                    System.out.printf("예금액: ");
                    int amount2 = Integer.parseInt(scanner.nextLine());
                    list.deposit(accountNumber2, amount2);
                    break;
                case 4 :
                    System.out.printf("-----------\n");
                    System.out.printf("출금\n");
                    System.out.printf("-----------\n");
                    System.out.printf("계좌번호: ");
                    String accountNumber3 = scanner.nextLine();
                    System.out.printf("\n");
                    System.out.printf("출금액: ");
                    int amount3 = Integer.parseInt(scanner.nextLine());
                    list.withdrawal(accountNumber3, amount3);
                    break;
            }
        }

    }
}
