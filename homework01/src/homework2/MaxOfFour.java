package homework2;

import java.util.Scanner;

public class MaxOfFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите 4 числa:");
		int  num1 = sc.nextInt();
		int  num2 = sc.nextInt();
		int  num3 = sc.nextInt();
		int  num4 = sc.nextInt();
		
		int max;
		
		if(num1 > num2) {
			max = num1;
		}else {
			max = num2;
		}
		if(num3 > max) {
			max = num3;
		}
		if(num4 > max) {
			max = num4;
		}
		
		System.out.println("Самое большое число:" + max);
	}

}

