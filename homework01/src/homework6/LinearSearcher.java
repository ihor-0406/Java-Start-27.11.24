package homework6;

public class LinearSearcher {

	public static void main(String[] args) {
		int[] num = {10,20,4,5,15,7};
		int target = 4;
		int index = linearSearch(num, target);
		System.out.println("Индекс числа "+ target + " : " + (index != 1 ? index: "Отсутствует") +" ;");
	}
	public static int linearSearch(int[] arr, int target) {
		for(int i=0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
