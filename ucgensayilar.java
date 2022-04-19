package OrnekProjeler;

import java.util.Scanner;

public class ucgensayilar {

	public static void main(String[] args) {

		System.out.println("Sayi Giriniz:");
		Scanner sayi = new Scanner(System.in);
		int sira = sayi.nextInt();
		
		for(int i = sira; i>1; i--) {
			for(int j = i; j>=1; j--) {
				System.out.print(j + "");
			}
			
			for(int k=2; k<=1; k++) {
				System.out.print(k + "");
			}
			System.out.println("");
			
		}
	}

}
