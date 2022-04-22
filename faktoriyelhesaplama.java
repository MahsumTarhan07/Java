import java.util.Scanner;

public class faktoriyelHesaplama {

	public static void main(String[] args) {

		int n;
		int fakt = 1;
		
		System.out.println("Bir Sayı Giriniz Lütfen");
		
		Scanner tara = new Scanner(System.in);
		n = tara.nextInt();
		
		int alınandeger = n;
		
		while(alınandeger >=1) {
			fakt = fakt * alınandeger;
			alınandeger = alınandeger - 1;
		}
		
		System.out.println(n + "!=" + fakt);
	}

}
