package js0415;

public class Cars {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Cars() {
	}
	
	Cars(String model) {
		this.model = model;
	}
	
	Cars(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Cars(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}