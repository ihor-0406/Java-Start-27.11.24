package homework7;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class SavaArray {

	public static void main(String[] args) {
		int [][] arr = {
				{10, 20, 30},
				{40, 50, 60},
				{70, 80, 90}
		};
		File file = new File("array.csv");
		saveArrayToFile(file, arr);
		System.out.println("Двумерный массив сохраненно в файл:" + file.getName());
	}
   public static void saveArrayToFile(File file, int[][] array) {
	        try (PrintWriter pw = new PrintWriter(file)) {
	            for (int[] row : array) {
	                for (int num : row) {
	                    pw.print(num + ";"); 
	                }
	                pw.println();
	            }
	        } catch (IOException e) {
	            System.out.println("Ошибка записи до файла");
	        }
	    }
	}
