package homework4;

public class Task1 {

	public static void main(String[] args) {
		
		int[] array = {0,5,2,4,7,1,3,19,101,35,47};
		int count=0;
		for(int num: array) {
			if(num %2 !=0) {
				count++;
			}
		}
		System.out.println("Количество нечетных чисел в массиве равняется:"+ count);
	}

}
