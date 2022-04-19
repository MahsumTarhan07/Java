package OrnekProjeler;

public class methodornk1 {
	// toplama method orneði
	public static void toplam(double sayi1, double sayi2) {
		double sonuc = sayi1 + sayi2;
		System.out.println(sayi1 + sayi2 + " =" +  sonuc);
	}
	
	// cýkarma method orneði
	public static void cikarma(double sayi1, double sayi2) {
		double sonuc = sayi1 - sayi2;
		System.out.println(sayi1 +  "-" + sayi2 + " =" +  sonuc);
	}
	// bolme
	public static void bolme(double sayi1, double sayi2) {
		double sonuc = sayi1 / sayi2;
		System.out.println(sayi1 +  "/" + sayi2 + " ="  +  sonuc);
	}
	public static void carpma(double sayi1, double sayi2) {
		double sonuc = sayi1 * sayi2;
		System.out.println(sayi1 +  "*" + sayi2 + " =" +  sonuc);
	}
	
	

	public static void main(String[] args) {
		System.out.println("Toplama");
		toplam(100, 500);
		System.out.println("Cikarma");
		cikarma(100, 400);
		System.out.println("Bolme");
		toplam(10, 2);
		System.out.println("Carpma");
		toplam(100, 200);
	}

}
