package OrnekProjeler;

import java.util.Scanner;

public interface switch_case2 {
	public static void main(String[] args) {
	
		System.out.println("Bir Ay Giriniz: ");
		
		Scanner tara = new Scanner(System.in);
		
		String ay = tara.next();
		
		switch(ay) {
		case "Mart":
		case "Nisan":
		case "May�s":
			System.out.println("�lkbahar Ay�");
			break;
		case "Haziran":
		case "Temmuz":
		case "A�ustos":
			System.out.println("Yaz Ay�");
			break;
		case "Eyl�l":
		case "Ekim":
		case "Kas�m":
			System.out.println("K�� Ay�");
			break;
		default:
			System.out.println("Bulunamadi Ay�");
			break;
		}
	}
}
