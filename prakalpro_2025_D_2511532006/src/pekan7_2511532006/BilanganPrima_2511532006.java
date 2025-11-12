package pekan7_2511532006;
import java.util.Scanner;

public class BilanganPrima_2511532006 {

	public static boolean IsPrime(int n) {
		int factors = n;
		for(int i = 1; i<= n; i++) {
			if(i % 2 == 0) {
				factors++;
			}
		}
		return (factors == 2);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input nilai n = ");
		int a = input.nextInt()	;
		if(IsPrime(a)) {
			System.out.println(a + "Bilangan prima");
		}else {
			System.out.println(a + "Bukan bilangan prima");
		}

	}

}
