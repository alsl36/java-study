package basics;

import java.util.Scanner;

public class basics10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int user = 0;
        int totalMoney = 0;
        while(user!=4) {
            System.out.printf("------------------------------\n");
            System.out.printf("1.예금 | 2.출금 | 3.잔고 | 4.종료\n");
            System.out.printf("------------------------------\n");
            System.out.printf("선택> ");
            user = Integer.parseInt(scanner.nextLine());
            switch(user) {
                case 1:
                    System.out.printf("예금액> ");
                    int amount1 = Integer.parseInt(scanner.nextLine());
                    totalMoney+=amount1;
                    System.out.printf("\n");
                    break;
                case 2:
                    System.out.printf("출금액> ");
                    int amount2 = Integer.parseInt(scanner.nextLine());
                    totalMoney-=amount2;
                    System.out.printf("\n");
                    break;
                case 3:
                    System.out.printf("잔고> %d\n", totalMoney);
                    break;
                default :
                    System.out.printf("프로그램 종료");

            }

        }
    }
}