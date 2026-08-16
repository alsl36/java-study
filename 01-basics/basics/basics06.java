package basics;

public class basics06 {
    public static void main(String[] args) {
        // 자동타입변환 : 값의 허용범위가 작은 타입이 큰 타입으로 대입될 때 발생
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println(intValue);

        // 강제타입변환 : 값의 허용범위가 큰 타입이 작은 타입으로 변환하려고 할 때 값을 쪼개서 강제로 대입가능
        long longValue = 300;
        int intValue2 = (int) longValue;
        System.out.println(intValue2);

        // 연산식에서는 기본 int타입으로 연산 수행하고, 피연산자 중 long타입이 있을 경우 다른 피연산자도 long으로 변환
        // 실수의 경우 두 피연산자가 같은 타입이면 해당 타입으로 계산. 피연사자 중 double 타입이 있을 경우 다른 피연산자도 double로 변환
        byte x = 10;
        byte y = 20;
        // byte result = x + y : 컴파일 에러
        int result = x + y;
        System.out.println("result : " + result);


        int intValue3 = 10;
        double doubleValue = 5.5;
        double result2 = intValue + doubleValue; // intValue를 double로 변환하여 계산이 수행되기 때문
        System.out.println("result2 : " + result2);
    }
    
}
