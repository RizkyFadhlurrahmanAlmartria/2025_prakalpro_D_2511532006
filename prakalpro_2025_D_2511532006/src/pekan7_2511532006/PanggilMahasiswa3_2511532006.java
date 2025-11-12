package pekan7_2511532006;
import java.util.Scanner;

public class PanggilMahasiswa3_2511532006 {

	public static void main(String[] args) {
		Mahasiswa_2511532006 a = new Mahasiswa_2511532006();
		Scanner input = new Scanner(System.in);
		System.out.print("NIM : ");
		a.setNim2(input.nextLine());
		System.out.print("Nama : ");
		a.setNama(input.nextLine());
		if(a.getNim2().startsWith("25")){
			System.out.println(a.getNama()+ " Anda Angkatan 2025");
		}
		if(a.getNim2().contains("1153")){
			System.out.println(a.getNama()+ " Anda Mahasiswa Informatika");
		}
	}

}
