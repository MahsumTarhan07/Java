package OrnekProjeler;

import java.util.Scanner;

public class varis_s�resi_hesaplama {

	public static void main(String[] args) {

		Scanner scan  = new Scanner(System.in);
		int yol, saat;
		int hesapla;
		System.out.println("Yol Mesafenizi Giriniz (KM) : ");
		yol = scan.nextInt();
		System.out.print("Gitmek �stedi�iniz yol s�resi Giriniz");
		saat = scan.nextInt();
		hesapla = (yol / saat);
		System.out.println("Gitmeniz gereken ortalam H�z" + hesapla);
		
	}

}
