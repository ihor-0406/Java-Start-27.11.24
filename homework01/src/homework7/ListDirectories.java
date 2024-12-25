package homework7;

import java.io.File;

public class ListDirectories {

	public static void main(String[] args) {
		File dir = new File (".");
		listDirectories(dir);
	}
	public static void listDirectories(File dir) {
		if(dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			System.out.println("Каталог в папке : "+ dir.getAbsolutePath());
			if(files != null) {
				for(File file : files) {
					if(file.isDirectory()) {
						System.out.println(file.getName());
					}
				}
			}
		}else{
			System.out.println("Указвный путь не существует или не является папкой");
		}
	}

}
