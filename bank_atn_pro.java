package OrnekProjeler;

import java.util.Scanner;

public class bank_atn_pro {

	public static void main(String[] args) {
		
		Scanner s  = new Scanner(System.in);
		
		int bakiye = 100000;
		
		System.out.println("1-Bakiye Sorgulama");
		System.out.println("2-Para Cekme");
		System.out.println("3-Para Yat�rma");

		while(true) {
			System.out.println("L�tfen i�lemi giriniz");
			int islem = s.nextInt();
			
			switch (islem){
				case 1:
					System.out.println("Bakiyeniz :" + bakiye + "dir" );
				break;
				case 2:
					System.out.println("Miktar giriniz :");
					int miktar = s.nextInt();
					bakiye -=miktar;
					System.out.println("Kalan Kullan�m miktar� : " + bakiye + " TL");
				break;
				case 3:
					System.out.println("Miktar Giriniz");
					int parayat�r = s.nextInt();
					bakiye += parayat�r;
					System.out.println("Yeni Bakiyeniz : " + bakiye + " TL");
				break;
				default:
					System.out.println("Gecersiz Bir de�er giridiniz");
				break;
			}
			
			System.out.println("Yeni ��lem yapmak istiyormusunuz ?  E / H");
			
			String yenidenislemyap = s.next();
			
			if(yenidenislemyap.equals("E")) {
				continue;
			}else if(yenidenislemyap.equals("H")) {
				System.out.print("Sitemde C�k�l�yor");
				System.out.print("Bankamatik Ba��ndan Ayr�lmay�n�z");
			}
		}
		

	}

}
