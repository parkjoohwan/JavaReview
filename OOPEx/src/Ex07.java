class Car{
	String color;
	static int redcar = 0;
	static int numcar = 0;
	Car(String n){
		color = n;
		numcar++;
		if(color == "red" || color == "RED")
			redcar++;
	}
	
	public static int getNumOfCar() {
		return numcar;
	}
	
	public static int getNumOfRedCar() {
		return redcar;
	}
	
	
}
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");
		
		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
	}

}
