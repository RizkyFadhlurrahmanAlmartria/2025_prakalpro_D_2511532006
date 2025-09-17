package Pekan1;

public class MembuatKue {

	public static void main(String[] args) {
		makeBatter();
		memanggang();
		memanggang();
		menghias();

	}
	
	public static void makeBatter() {
		
		System.out.println("Campur Bahan kering.");
		System.out.println("Krim mentega dan gula.");
		System.out.println("Kocok Telurnya");
		System.out.println("Masukkan bahan kering.");
		
	}
	public static void memanggang() {
		System.out.println("Setel suhu oven.");
		System.out.println("Setel pengatur waktu.");
		System.out.println("Masukkan kue kedalam oven.");
		System.out.println("Biarkan cookie untuk dipanggang.");
	}
	
	public static void menghias() {
		System.out.println("Campur bahan untuk frosting.");
		System.out.println("Taburkan frosting dan taburan.");
	}

}
