package js0415;

public class Car4 {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    public static void main(String[] args) {
        Car4 myCar = new Car4();
        myCar.speed = 60;
        myCar.run();
    }
}
