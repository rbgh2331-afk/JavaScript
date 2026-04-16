package js0416.js0416test5;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        
        sa.takeOff();
        sa.fly(); // 기본 NORMAL 모드이므로 super.fly() 호출됨
        
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly(); // SUPERSONIC 모드이므로 "초음속비행합니다." 출력
        
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        
        sa.land();
    }
}