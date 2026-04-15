package js0415;

public class CalculatorExample1 {
	public static void main(String[] args) {
		Calculator1 myCalc = new Calculator1();

		int result1 = myCalc.plus(5, 5);
        double result2 = myCalc.plus(1.5, 5);
        double result3 = myCalc.plus(5, 1.5);
        double result4 = myCalc.plus(1.5, 1.5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);
    }
}