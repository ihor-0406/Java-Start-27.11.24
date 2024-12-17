package homework5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Введите текст: ");
		
		String input = sc.nextLine();
		
		String[] words= input.split(" ");
		String logesWord ="";
		for(String word : words) {
			if (word.length() > logesWord.length()) {
				logesWord = word;
			}
		}
		System.out.println("Самое длинное слово: " + logesWord);
	}

}
