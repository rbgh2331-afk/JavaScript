package js0421;

class Datae<T extends Number> { //Number 클래스의 하위 클래스 타입
    T obj;
    Datae(T ob) {
        obj = ob;
    }
    int calcMultiple(int n) {
        return obj.intValue() * n;
    }
}

public class Code231 {
    public static void main(String[] args) {
        Datae<Integer> d = new Datae<Integer>(100); //Integer는 Number의 하위 클래스임.
        int result = d.calcMultiple(5);
        System.out.println(result);

        Datae<Double> e = new Datae<Double>(17.5); //Double 역시 Number의 하위 클래스임.
        int result2 = e.calcMultiple(5);
        System.out.println(result2);
    }
}