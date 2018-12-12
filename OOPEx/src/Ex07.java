class Car{
	String color;
	static int value=0;
	static int redValue=0;
	
	 Car(String a){   //생성자
		 color=a;
		 value++;
		 if(a=="red" || a=="RED")
			 redValue ++;
	
		 
		 
	 }
	 public static int getNumOfCar() {
		 return value;
		 
	 }
	 public static int getNumOfRedCar() {
		 return redValue;
	 }
}


public class Ex07 {

	public static void main(String[] args) {
		Car c1=new Car("red");
		
		Car c2=new Car("blue");
		Car c3=new Car("RED");
		
		System.out.printf("자동차 수 :  %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
	}

}
