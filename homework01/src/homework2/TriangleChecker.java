package homework2;

import java.util.Scanner;

public class TriangleChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите длину трех сторон треугольника:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a + b > c && a + c > b && b + c > a) {
			System.out.println("Такой треугольник существует.");
		}else {
			System.out.println("Такого треугольника не существует.");
		}
	}
}
