package OrnekProjeler;

import java.util.Scanner;

public class kulgirsayinegatifvspozitifimi {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz: ");
		
		double sayi = reader.nextInt();
		
		// sayi 0 dan kücük ise negatiftir.
		
		if(sayi <0.0) {
			System.out.println("Negatif sayý :" + sayi);
			
		}
		
		if(sayi >0.0) {
			System.out.println("Pozitif sayý :" + sayi);
		}	
	}
	
}
