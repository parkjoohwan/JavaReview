import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
public class EXMathClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*  Math 클래스에는 자연로그의 밑과 파이만 정의되어있음
		 *  생성자가 private라 다른 클래스에서 인스턴스 생성 불가
		 */
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		double a = 1.234;
		System.out.println(Math.round(a));
		
		/*
		 * jdk 1.8부터 정수형 연산시 발생하는 오버플로우를 감지하는 메서드들이 추가됨
		 * 오버플로우가 발생하면 ArithmeticException 발생 addExact, subtractExact 등등
		 */
		
	}

}
