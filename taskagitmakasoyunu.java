package OrnekProjeler;

import java.util.Scanner;


public class taskagitmakasoyunu {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int kul_puan = 0;
		int bil_puan = 0;
		System.out.print("Ta� Ka�it Makas Oyununa Hos Geldinz");
		System.out.print(" 1-TAS , 2-Ka�it, 3-Makas");
		
		
		while(true) {
			System.out.println("Seciminiz");
			int secim = s.nextInt();
			int bil_secim = (int) (Math.random()*3);
			
			if(secim == 1) {
				if(bil_secim == 1) {
					System.out.println("Bilgisayar secimi : Ta�Sonucu : Beraber");
					System.out.println("Puan�n�z :" + kul_puan + "Bilgisyar�n Puan�n: " + bil_puan + bil_puan++);
				}else if(bil_secim == 2) {
					System.out.println("Bilgisayar�n Secimi: Ka��tSonucu: Kaybetiniz"+ bil_puan);
					System.out.println("Puan�n�z: "+kul_puan+" Bilgisayar�n puan�:"+bil_puan);
				}else {
					System.out.println("Bilgisayar�n Secimi : Makas Sonuc:  KAZANDINIZ " );
					System.out.println("Kullan�c�n�n Puan�n�:" + kul_puan);
					System.out.println("Bilgisayar�n Sonucu :" + bil_puan);
				}
			}else if(secim == 2) {
				if(bil_secim == 1) {
					System.out.println("Bilgisayar�n secimi : Ta� Sonucu: Kazand�n�z");
					System.out.println("Puan�n�c :" + kul_puan + "Bilgisay�n puan�n" +bil_puan);
				}else if(secim == 3) {
					if(bil_secim ==1) {
						System.out.println("Bilgisayar�n Secimi : Ta� Sonuc Kaybetiniz");
						System.out.println("Puan�n�z " + kul_puan + "Bilgisayar�n puan�n� :" + bil_puan);
					}else if(bil_secim == 2) {
						System.out.println("Bilgisayar�n secimi : Ka��t Sonuc :Kazand�n�z");
						System.out.println("Puan�n�z " + kul_puan + "Bilgisayar�n puan :" + bil_puan);
					}else {
						System.out.println("Bilgisayar�n Secimi : Makas Sonuc : Beraber");
						System.out.println("Puan�n�z "+ kul_puan + "Bilgisayar�n puan�n� :" + bil_puan);
					}
				}else {
					System.out.println("Hatal� Giri� Yapt�n�z L�tfen Tekrar Oynay�n�z");
					continue;
					
				}
			}
		}
	

	}

}
