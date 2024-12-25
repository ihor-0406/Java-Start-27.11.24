package homework7;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextEditor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите текст: ");
		StringBuilder  text = new StringBuilder();
		while (true) {
			String line = sc.nextLine();
			if(line.isEmpty()) {
				break;
			}
			text.append(line).append(System.lineSeparator());
		}
		System.out.println("Введить название файла: ");
		String fileName= sc.nextLine();
		File file = new File(fileName);
		
		saveStringToFile(file, text.toString());
		System.out.println("Текст сохранено в файл.");
	}	
	public static void saveStringToFile(File file, String text) {
		try(PrintWriter pw = new PrintWriter(file)){
			pw.print(text);
		}catch(IOException e) {
			System.out.println("Ошибка записи у файл");
		}
	}
}
