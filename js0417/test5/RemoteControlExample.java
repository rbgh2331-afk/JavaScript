package js0417.test5;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc = new Audio();
        rc = new SmartTelevision();

        RemoteControl.changeBattery();
    }
}