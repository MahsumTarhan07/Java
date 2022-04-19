package OrnekProjeler;

import java.util.Scanner;

public class switchcase_pro {

	public static void main(String[] args) {

		System.out.println("Bir Gün Sayýsýný Giriniz");
		
		int günsayisi = new Scanner(System.in).nextInt();
		
		switch(günsayisi) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2 :
			System.out.println("Sali");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Bulunamadi, Deðri Kontrol Ediniz");
			break;
			
			
		}
	}

}
