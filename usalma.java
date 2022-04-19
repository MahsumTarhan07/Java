package OrnekProjeler;

public class usalma {

	public static void main(String[] args) {

		int taban = 3;
		int kuvet = 4;
		
		long sonuc = 1;
		
		while (kuvet != 0) {
			sonuc *=taban;
			--kuvet;
		}
		System.out.println("Cevap =" + sonuc);
	}

}
