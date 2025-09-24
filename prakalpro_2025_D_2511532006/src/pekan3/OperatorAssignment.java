package pekan3;

import java.util.Scanner;
public class OperatorAssignment {
	public static void main(String[] args) {
		int A1;
		int A2;
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Input Angka-1:");
		A1 = Keyboard.nextInt();
		System.out.println("Input Angka-2: ");
		A2 = Keyboard.nextInt();
		Keyboard.close();
		System.out.println("Operator Penjumlahan");
		A1 += A2;
		System.out.println("Hasil = " + A1);
		System.out.println("Operator Pengurangan");
		A1 -= A2;
		System.out.println("Hasil = " + A1);
		System.out.println("Operator Perkalian");
		A1 *= A2;
		System.out.println("Hasil = " + A1);
		System.out.println("Operator Penjumlahan");
		A1 /= A2;
		System.out.println("Hasil = " + A1);
		System.out.println("Operator Penjumlahan");
		A1 %= A2;
		System.out.println("Hasil = " + A1);
	}
}
