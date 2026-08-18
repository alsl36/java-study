package classCode;

public class Calculator {
    // 필드 없음

    // 기본 생성자

    void powerOn() {
        System.out.println("전원을 켭니다.");
    }
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }
    int plus(int x, int y) {
        return x+y;
    }
    double divide (int x, int y) {
        double result = (double) x / (double) y;
        return result;
    }
}
