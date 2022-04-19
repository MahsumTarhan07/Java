package OrnekProjeler;

import java.util.Scanner;

public class tekciftsayimi {

	public static void main(String[] args) {

		Scanner giris  = new Scanner(System.in);
		int sayi;
		System.out.println("Bir sayý giriniz /n");
		
		while(true) {
		sayi = giris.nextInt();
		
		if(sayi %2==0) {
			System.out.println("Sayýsý Cift sayýdýr");
		}else if(sayi %2!=0) {
			System.out.println(sayi + "Sayýsý Tek Sayýdýr");
		}else {
			System.out.println("Bilinmeyen Bir Hata Oldu");
		}
		
		System.out.println("Yeni Ýþlem  yapmak istiyormusunuz ? E /H");
		String yeniþlemyap = giris.next();
		
		if(yeniþlemyap.equals("E")) {
			continue;
		}else if(yeniþlemyap.equals("H")) {
			System.out.println("Sistemde Cýkýlýyor");
			System.out.println("Tekrar Belkleriz.");
		}
		}
		
	}

}
