package js0410;

import java.util.Scanner;

public class test {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
	
    System.out.print("x 값 입력: ");
	String strX = scanner.nextLine();
	int x = Integer.parseInt(strX);
		
	System.out.print("y 값 입력: ");
	String strY = scanner.nextLine();
	int y = Integer.parseInt(strY);

        
	while(true) {

        System.out.print("사칙연산 입력(+, -, *, /): ");
        String op = scanner.nextLine();

		int e = 0;

        if (op.equals("+")) {
            e = x + y;
            System.out.println("결과: " + x + " + " + y + " = " + e);
        } else if (op.equals("-")) {
            e = x - y;
            System.out.println("결과: " + x + " - " + y + " = " + e);
        } else if (op.equals("*")) {
            e = x * y;
            System.out.println("결과: " + x + " * " + y + " = " + e);
        } else if (op.equals("/")) {
            e = x / y;
            System.out.println("결과: " + x + " / " + y + " = " + e);
        } else {
            System.out.println("잘못된 문자입니다. +, -, *, / 중에 입력하세요.");
        }

        String data = scanner.nextLine();
        if(data.equals("q")) {
            break;
        }
    }
	    System.out.println("종료");
	}
}