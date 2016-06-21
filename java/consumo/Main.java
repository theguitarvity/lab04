import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		float y, media = 0;
		x = scan.nextInt();
		y = scan.nextFloat();

		media = x/y;

		System.out.printf("%.3f km/l\n", media); 

	}
}