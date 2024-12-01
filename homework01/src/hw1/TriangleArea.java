package hw1;

public class TriangleArea {

	public static void main(String[] args) {
		double sideA = 0.3 ;
	    double sideB = 0.4 ;
	    double sideC = 0.5 ;
	    
	    double perimeter = (sideA + sideB + sideC) / 2;
	    
	    double area = Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC));
	    System.out.println("Площаль треугольника: " + area);


	}

}
