package basics;

public class basics02 {
    public static void main(String[] args) {
        int x = 0b1011; // 2진수 리터럴
        int y = 013; // 8진수 리터럴
        int z = 0xB3; // 16진수 리터럴
        long var1 = 1000000000000L; // long 타입은 뒤에 L을 붙여 컴파일러에게 알려줘야 됨
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(var1);
    }
}