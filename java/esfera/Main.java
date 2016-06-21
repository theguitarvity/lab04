import java.util.Scanner;
public class Main{
	//public static final double pi = 3.14159;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double raio, volume = 0, pi = 3.14159;
		raio = scan.nextDouble();
		volume = (4.0/3)*pi*(raio*raio*raio);
		System.out.printf("VOLUME = %.3f\n",volume);


	}
}