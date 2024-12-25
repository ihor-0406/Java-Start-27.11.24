package homework6;

public class RectangleDrawer {

	public static void main(String[] args) {
		System.out.println();
		drawRectangle(10,3);
	}
	public static void drawRectangle(int width, int height) {
		for(int i=0; i < height; i++) {
			for(int j=0; j < width; j++) {
				if( i == 0 || i == height - 1 || j == 0 || j == width - 1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
		}
		System.out.println();
		}
	}
}
