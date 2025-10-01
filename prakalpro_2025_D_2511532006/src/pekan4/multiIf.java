package pekan4;
import java.util.Scanner;

public class multiIf {

	public static void main(String[] args) {
		int umur;
		char sim;
		Scanner input = new Scanner(System.in);
		System.out.println("Input umur anda : ");
		umur = input.nextInt();
		System.out.println("Apakah Anda memiliki SIM C:");
		sim = input.next().charAt(0);
		input.close();
		
		if((umur>=17)&&(sim=='y')) {
			System.out.println("Anda Sudah Dewasa dan boleh bawa motor");
		}
		if((umur>=17)&&(sim!='y')) {
			System.out.println("Anda Sudah Dewasa Tapi Tidak Boleh Bawa motor");
		}
		if((umur<17)&&(sim!='y')) {
			System.out.println("Anda Belum cukup umur bawa motor");
		}
		if((umur<17)&&(sim=='y')) {
			System.out.println("Anda Belum Cukup Umur punya SIM");
		}

	}

}
