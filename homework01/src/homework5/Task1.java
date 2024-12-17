package homework5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Введите текст: ");
		String input = sc.nextLine();
		
		char targetChar = 'b';
		int count = 0;
		
		for(char c : input.toCharArray()) {
			if(c == targetChar) {
				count++;
			}
		}
		System.out.println("Количество символов: " + targetChar + ":" + count);
	}

}
