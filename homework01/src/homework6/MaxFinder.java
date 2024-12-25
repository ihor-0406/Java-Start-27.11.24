package homework6;

public class MaxFinder {

	public static void main(String[] args) {
		int[] numbers = {5,55,155,45,35,40,205};
		System.out.println("Max number: "+findMax(numbers));
	}
	public static int findMax(int[] array) {
		int max = array[0];
		for(int num : array) {
			if(num > max) {
				max = num;
			}
		}
		return max;
	}
}

