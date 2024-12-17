package homework4;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int size = 15;
		int [] fistArray = new int[size];
		System.out.println("Первый массив: ");
		for(int i=0; i < size; i++) {
			fistArray[i] = random.nextInt(10)+1;
			System.out.println(fistArray[i] + " ");
		}
		
		int[] secondArray = new int[size * 2];
		for(int i= 0; i < secondArray.length; i++) {
			if(i < size) {
				secondArray[i] = fistArray[i];
			}else {
				secondArray[i]= fistArray [ i - size]*2;
			}
		}
		System.out.println("Второй массив: ");
		for(int num : secondArray) {
			System.out.println(num + " ");
		}
	}

}
