package pekan3;

import java.util.Scanner;
public class OperatorAritmatika {
	public static void main(String[] args) {
		int A1;
		int A2;
		int hasil;
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Input Angka-1:");
		A1 = Keyboard.nextInt();
		System.out.println("Input Angka-2: ");
		A2 = Keyboard.nextInt();
		Keyboard.close();
		System.out.println("Operator Penjumlahan");
		hasil = A1 +A2;
		System.out.println("Hasil = " + hasil);
		System.out.println("Operator Pengurangan");
		hasil = A1 -A2;
		System.out.println("Hasil = " + hasil);
		System.out.println("Operator Perkalian");
		hasil = A1 +A2;
		System.out.println("Hasil = " + hasil);
		System.out.println("Operator Pembagian");
		hasil = A1 /A2;
		System.out.println("Hasil = " + hasil);
		System.out.println("Operator Sisa Bagi");
		hasil = A1 %A2;
		System.out.println("Hasil = " + hasil);
	}
}
