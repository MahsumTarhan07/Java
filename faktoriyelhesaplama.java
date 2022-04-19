package OrnekProjeler;

import java.util.Scanner;

public class faktoriyelhesaplama {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Bir sayi Giriniz");
		
		int num = reader.nextInt();
		int sayac = num;
		long faktoriyel = 1;
		
		while(sayac>1) {
			faktoriyel *=sayac;
			sayac--;
		}
		System.out.printf("%d Sayýsýnýn Faktöriyeli  = %d \n" , num , faktoriyel);
	}

}
