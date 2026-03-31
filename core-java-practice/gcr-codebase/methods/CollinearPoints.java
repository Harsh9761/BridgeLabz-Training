
public class CollinearPoints {

	public static void main(String[] args) {
		int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        System.out.println("Points: A(" + x1 + "," + y1 + "), B(" + x2 + "," + y2 + "), C(" + x3 + "," + y3 + ")");

        if(collinearSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Collinear (Slope Method): Yes");
        } else {
            System.out.println("Collinear (Slope Method): No");
        }

        if(collinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Collinear (Area Method): Yes");
        } else {
            System.out.println("Collinear (Area Method): No");
        }

	}
	
	public static boolean collinearSlope(int x1, int y1,int x2, int y2,int x3, int y3) {
		int dy1 = y2 - y1;
		int dx1 = x2 - x1;
		int dy2 = y3 - y2;
		int dx2 = x3 - x2;

		return (dy1 * dx2 == dy2 * dx1);
	}

	public static boolean collinearArea(int x1, int y1,
        int x2, int y2,
        int x3, int y3) {
		double area = 0.5 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
		return area == 0;
	}

}
