package homework2;

import java.util.Scanner;

public class TriangleChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите длину трех сторон треугольника:");
		int sideA = sc.nextInt();
		int sideB = sc.nextInt();
		int sideC = sc.nextInt();
		
		if(sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
			System.out.println("Такой треугольник существует.");
		}else {
			System.out.println("Такого треугольника не существует.");
		}
	}
}
