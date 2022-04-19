package OrnekProjeler;

import java.util.Scanner;

public class if_ile_not_hesaplama {

	public static void main(String[] args) {
		System.out.println("Notunuz Girin");
		int not = new Scanner(System.in).nextInt();
		
		if(not>=90) {
			System.out.println("AA");
		}else if(not >=85) {
			System.out.println("BB");
		}else if(not >= 75) {
			System.out.println("CC");
		}else if(not>=65) {
			System.out.println("DD");
		}else if(not>=55) {
			System.out.println("FF");
		}else if(not >=45) {
		System.out.println("EE");
	}
  }


}
