import java.util.Scanner;
import java.lang.Math;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1,y1,x2,y2, distancia = 0;

		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();

		distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

		System.out.printf("%.4f\n", distancia);

		
	}
}