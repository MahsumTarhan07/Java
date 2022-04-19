package OrnekProjeler;

import java.util.Scanner;


public class taskagitmakasoyunu {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int kul_puan = 0;
		int bil_puan = 0;
		System.out.print("Taþ Kaðit Makas Oyununa Hos Geldinz");
		System.out.print(" 1-TAS , 2-Kaðit, 3-Makas");
		
		
		while(true) {
			System.out.println("Seciminiz");
			int secim = s.nextInt();
			int bil_secim = (int) (Math.random()*3);
			
			if(secim == 1) {
				if(bil_secim == 1) {
					System.out.println("Bilgisayar secimi : TaþSonucu : Beraber");
					System.out.println("Puanýnýz :" + kul_puan + "Bilgisyarýn Puanýn: " + bil_puan + bil_puan++);
				}else if(bil_secim == 2) {
					System.out.println("Bilgisayarýn Secimi: KaðýtSonucu: Kaybetiniz"+ bil_puan);
					System.out.println("Puanýnýz: "+kul_puan+" Bilgisayarýn puaný:"+bil_puan);
				}else {
					System.out.println("Bilgisayarýn Secimi : Makas Sonuc:  KAZANDINIZ " );
					System.out.println("Kullanýcýnýn Puanýný:" + kul_puan);
					System.out.println("Bilgisayarýn Sonucu :" + bil_puan);
				}
			}else if(secim == 2) {
				if(bil_secim == 1) {
					System.out.println("Bilgisayarýn secimi : Taþ Sonucu: Kazandýnýz");
					System.out.println("Puanýnýc :" + kul_puan + "Bilgisayýn puanýn" +bil_puan);
				}else if(secim == 3) {
					if(bil_secim ==1) {
						System.out.println("Bilgisayarýn Secimi : Taþ Sonuc Kaybetiniz");
						System.out.println("Puanýnýz " + kul_puan + "Bilgisayarýn puanýný :" + bil_puan);
					}else if(bil_secim == 2) {
						System.out.println("Bilgisayarýn secimi : Kaðýt Sonuc :Kazandýnýz");
						System.out.println("Puanýnýz " + kul_puan + "Bilgisayarýn puan :" + bil_puan);
					}else {
						System.out.println("Bilgisayarýn Secimi : Makas Sonuc : Beraber");
						System.out.println("Puanýnýz "+ kul_puan + "Bilgisayarýn puanýný :" + bil_puan);
					}
				}else {
					System.out.println("Hatalý Giriþ Yaptýnýz Lütfen Tekrar Oynayýnýz");
					continue;
					
				}
			}
		}
	

	}

}
