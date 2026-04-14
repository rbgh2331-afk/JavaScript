package js0413;

public class test01 {
    public static void main(String[] args) {
        for (int m=3; m<=6; m++) {
            System.out.println("*** " + m + "학년 ***");
            for (int n=5; n>=1; n--) {
                System.out.println(m + " 학년 " + n + " 반 ");
            }
        }
    }
}