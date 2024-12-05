package homework2;

import java.util.Scanner;

public class ApartmentLocator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите номер квартиры:");
		int apartmentNumer = sc.nextInt();
		
		int apartmetsPerFloor = 4;
		int floors = 9;
		int entrances = 5;
		
		int apartmentsPerEntrance = apartmetsPerFloor * floors;
		
		if(apartmentNumer < 1 || apartmentNumer > apartmentsPerEntrance * entrances) {
			System.out.println("Такой квартиры нет");
		}else {
			int entrance = (apartmentNumer -1) / apartmentsPerEntrance + 1;
			int floor = ((apartmentNumer - 1) % apartmentsPerEntrance) / apartmetsPerFloor + 1;
			
			System.out.println("Подьезд:" + entrance);
			System.out.println("Этаж:" + floor);
		}
	}

}
