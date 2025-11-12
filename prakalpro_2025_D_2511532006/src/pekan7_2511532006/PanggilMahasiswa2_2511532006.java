package pekan7_2511532006;
import java.util.Scanner;

public class PanggilMahasiswa2_2511532006 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("NIM : ");
		String X = input.nextLine();
		System.out.print("Nama : ");
		String Y = input.nextLine();
		Mahasiswa_2511532006 a = new Mahasiswa_2511532006();
		a.setNim2(X);
		a.setNama(Y);
		if(X.startsWith("25")) {
			System.out.println(Y + " Anda Angakatan 2025");
		}
		if (X.contains("1153")) {
			System.out.println(Y+ " Anda Mahasiswa Informatika");
		}
		a.cetak2();
		input.close();
		
		
	}
}
