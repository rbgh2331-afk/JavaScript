package js0410;

public class FloatDoubleExample {
    public static void main(String[] args){
        double var1 = 3.14; // 실수값 저장
        // float var2 = 3.14;     // 컴파일 에러(Type Mismatch)
        float var3 = 3.14F;

        // 정밀도 테스트
        double var4 = 0.1234567890123456789;
        float var5 = 0.1234567890123456789F;

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);
    }
}
