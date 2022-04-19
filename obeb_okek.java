package OrnekProjeler;

public class obeb_okek {

	public static void main(String[] args) {
		int sayi1 = 48;
		int sayi2 = 160;
		int ebob = 1;
		int ekok;
		
		for(int  i = 1; i<=sayi1 && i<=sayi2; i++) {
			if(sayi1 % i == 0 &&  sayi2 % i ==0) {
				ebob =i;
			}
			ekok = (sayi1 * sayi2) / ebob;
			System.out.printf("%d ve %d sayýlarýn EBOB'u % d \n", sayi1, sayi2, ebob);
			System.out.printf("%d ve %d sayýlarýn EBOB'u % d \n", sayi1, sayi2, ekok);
		}
	}
}
