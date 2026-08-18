package classCode;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        
        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println(result1);

        double result2 = myCalc.divide(8, 5);
        System.out.println(result2);
    }
}
