package OrnekProjeler;

import java.util.Scanner;

public class tekciftsayimi {

	public static void main(String[] args) {

		Scanner giris  = new Scanner(System.in);
		int sayi;
		System.out.println("Bir say� giriniz /n");
		
		while(true) {
		sayi = giris.nextInt();
		
		if(sayi %2==0) {
			System.out.println("Say�s� Cift say�d�r");
		}else if(sayi %2!=0) {
			System.out.println(sayi + "Say�s� Tek Say�d�r");
		}else {
			System.out.println("Bilinmeyen Bir Hata Oldu");
		}
		
		System.out.println("Yeni ��lem  yapmak istiyormusunuz ? E /H");
		String yeni�lemyap = giris.next();
		
		if(yeni�lemyap.equals("E")) {
			continue;
		}else if(yeni�lemyap.equals("H")) {
			System.out.println("Sistemde C�k�l�yor");
			System.out.println("Tekrar Belkleriz.");
		}
		}
		
	}

}
