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
		case "Mayýs":
			System.out.println("Ýlkbahar Ayý");
			break;
		case "Haziran":
		case "Temmuz":
		case "Aðustos":
			System.out.println("Yaz Ayý");
			break;
		case "Eylül":
		case "Ekim":
		case "Kasým":
			System.out.println("Kýþ Ayý");
			break;
		default:
			System.out.println("Bulunamadi Ayý");
			break;
		}
	}
}
