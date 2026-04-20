package js0417.test2;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.driver(bus);
        driver.driver(taxi);
    }
}
