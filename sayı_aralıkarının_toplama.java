package OrnekProjeler;

public class sayý_aralýkarýnýn_toplama {
	public static void main(String[] args) {
		
		int sayi = 10;
		int toplam = 0;
		
		for(int i = 1; i<=sayi; ++i) {
			// toplam = toplam + i;
			toplam +=i;
		}
		System.out.println("Sayilarin Toplamý =" + toplam);
		
	}

}
