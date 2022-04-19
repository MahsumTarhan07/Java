package OrnekProjeler;

public class forOrnekleri {

	public static void main(String[] args) {
/*
	int veritabaninKayitSayisi = 35;
	
	for(int i=1; i < veritabaninKayitSayisi; i++) {
		System.out.println( i + "Kayýt");
		if(i==15) {
			break;
		}
	}
*/
		int veritabaninKayitSayisi = 35;
		
		for(int i =1; i <=veritabaninKayitSayisi; i++) {
			if(i ==1) {
				continue;
			}
			System.out.println(i + "Kayit");
		}
	}
	

}
