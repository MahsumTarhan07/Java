package OrnekProjeler;

public class algoritmaexp1 {

	public static void main(String[] args) {

		int randomSayi = (int)(Math.random()*(1000)); //0 ile 1000 aras�nda say�
		System.out.println("Random Sayi :" + randomSayi);
		
		int birler = randomSayi % 10; // birler basma�� de�eri veririr.
		
		randomSayi = randomSayi / 10;
		int onlar = randomSayi / 10;
		
		int yuzler = randomSayi / 10;
		
		System.out.println("Toplamlar� " + (birler + onlar + yuzler));
		
	}

}
