package pekan6_2511532006;
import java.util.Scanner;

public class PerulanganWhile1_2511532006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter =0;
		String jawab ="";
		boolean running = true;
		
		Scanner scan = new Scanner(System.in);
		
		
		while(running) {
			counter++;
			System.out.println("Jumlah ="+ counter);
			System.out.println("Apakah Lanjut? (ya/tidak)");
			jawab = scan.nextLine();
			if(jawab.equalsIgnoreCase("tidak")) {
				running = false;
			}
		}
		System.out.println("Anda sudah melakukan pengulangan sebanyak"+ counter);
		
	}

}
