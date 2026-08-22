package interfaceCode;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.run();

        // vehicle.checkFare() 호출 불가능함. 리모콘에 없는 기능임.(기능임)

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
