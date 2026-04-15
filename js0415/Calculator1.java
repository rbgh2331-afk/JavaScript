package js0415;

public class Calculator1 {
	//필드
	//생성자
	//메소드
	int plus(int x, int y) {
		return x + y;
	}

    double plus(double x, int y) {
		return x + y;
	}
    double plus(int x, double y) {
		return x + y;
	}
    double plus(double x, double y) {
		return x + y;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y); // 위에서 만든 plus 메소드 호출
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10); // 내 안에 있는 avg 메소드 호출
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}