package homework4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Введите размер массива");
	
	int size = sc.nextInt();
	int [] array= new int[size];
	System.out.println("Введите элементы массива");
	for(int i=0; i < size; i++) {
		System.out.println("Элемент"+ (i + 1)+ ": ");
		array [i] = sc.nextInt();
	}
	System.out.println("Ваш массив: ");
	for(int num : array) {
		System.out.print(num + " ");
	}
	}

}
