package homework7;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ShowflakeArt {

	public static void main(String[] args) {
		File file = new File("showflake.txt");
		createShowflake(file, 40 );
		System.out.println("Узор сохранено в файл: "+ file.getName());
	}
	public static void createShowflake(File file, int size) {
		try(PrintWriter pw = new PrintWriter(file)){
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					if(i == j || i + j == size - 1 || i == size / 2 || j == size / 2) {
						pw.print("*");
					}else {
						pw.print(" ");
					}
				}
				pw.println();
			}
		}catch(IOException e) {
			System.out.println("Ошибка записи" + e.getMessage());
		}
	}

}
