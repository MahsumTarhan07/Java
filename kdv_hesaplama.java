package OrnekProjeler;

import java.util.Scanner;

public class kdv_hesaplama {

	public static void main(String[] args) {

		Scanner scan  = new Scanner(System.in);
		System.out.print("Ürün KDV'siz Fiyati giriniz: ");
		int fiyat = scan.nextInt();
		
		double yeni_fiyat = fiyat + (fiyat * 0.18);
		
		System.out.print("KDV'li Fiyat = " + yeni_fiyat);
	}

}
