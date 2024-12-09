package homework3;

import java.util.Scanner;

public class StarRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введить высоту прямоугольника:");
		int height = sc.nextInt();
		
		System.out.print("Введить ширину прямоугольника:");
		int width = sc.nextInt();
		
		for(int i=1; i<=height; i++) {
			for(int j=1; j<=width; j++) {
				if(i==1 || i==height || j==1 || j==width) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
