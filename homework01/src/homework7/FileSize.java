package homework7;

import java.io.File;

public class FileSize {

	public static void main(String[] args) {
		File file = new File("array.csv");
		System.out.println("Размер файла : " + getFileSize(file));
	}
	public static String getFileSize(File file) {
		if(file.exists() && file.isFile()) {
			long size = file.length();
			if(size < 1024) {
				return size + " B";
			}else if(size < 1024 * 1024) {
				return (size / 1024) + " KB";
			}else if(size < 1024 * 1024 * 1024) {
				return (size /(1024 * 1024)) + " MB";
			}else {
				return(size /(1024 * 1024 * 1024)) + " GB";
			}
		}else {
			return "Файл не существует.";
		}
	}	
}
