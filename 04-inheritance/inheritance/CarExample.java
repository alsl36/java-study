package inheritance;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
    }
}