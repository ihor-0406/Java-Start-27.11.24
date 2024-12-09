package homework3;

import java.util.Scanner;

public class FactorialCalkulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число n, (4<n<16):");
		
		int n = sc.nextInt();
		
		if(n <= 4 || n>= 16) {
			System.out.println("Число должно быть в диапозоне от 5 до 15");
		}else {
			int start = 1;
			for(int i=1; i <=n; i++) {
				start *= i;
			}
			System.out.println("Факториал числа" + n + "=" + start);
		}

	}

}