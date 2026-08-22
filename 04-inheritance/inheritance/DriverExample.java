package inheritance;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
    
}
