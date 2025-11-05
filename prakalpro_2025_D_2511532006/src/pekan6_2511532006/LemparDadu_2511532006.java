package pekan6_2511532006;
import java.util.*;

public class LemparDadu_2511532006 {
	public static void main(String[] Args) {
		Random rand = new Random();
		int tries = 0;
		int sum = 0;
		while (sum !=7) {
			int dadu1 = rand.nextInt(6) + 1;
			int dadu2 = rand.nextInt(6) + 1;
			sum = dadu1+dadu2;
			System.out.println(dadu1 + "+" + dadu2 + "=" + sum);
			tries++;			
		}
		System.out.println("You won after" + tries + "tries!");
	}
}
