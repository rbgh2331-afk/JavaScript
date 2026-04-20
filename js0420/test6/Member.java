package js0420.test6;

import java.util.Arrays;

public class Member implements Cloneable {
    public String name;
    public int age;
    public int[] scores; // 참조 타입 (배열)
    public Car car;      // 참조 타입 (클래스 객체)

    public Member(String name, int age, int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // [1] 먼저 얕은 복사를 해서 name, age를 복제한다.
        Member cloned = (Member) super.clone();
        
        // [2] scores를 깊은 복제한다. (새로운 배열 객체를 만들어 값 복사)
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        
        // [3] car를 깊은 복제한다. (새로운 Car 객체를 생성)
        cloned.car = new Car(this.car.model);
        
        // [4] 깊은 복제된 Member 객체를 리턴
        return cloned;
    }

    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}