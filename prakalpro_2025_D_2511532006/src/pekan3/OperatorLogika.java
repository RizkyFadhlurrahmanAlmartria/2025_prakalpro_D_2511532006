package pekan3;

import java.util.Scanner;
public class OperatorLogika {
	public static void main(String[] args) {
		boolean A1;
		boolean A2;
		boolean C;
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Input Angka-1:");
		A1 = Keyboard.nextBoolean();
		System.out.println("Input Angka-2: ");
		A2 = Keyboard.nextBoolean();
		Keyboard.close();
		System.out.println("A1 = " + A1);
		System.out.println("A2 =" + A2);
		
		System.out.println("Konjungsi");
		C = A1 && A2;
		System.out.println("true and false = " + C);
		
		System.out.println("Disjungsi");
		C = A1 || A2;
		System.out.println("true or false = " + C);

		System.out.println("Negasi");
		C = !A1;
		System.out.println("Bukan True = " + C);
		
	}
}
