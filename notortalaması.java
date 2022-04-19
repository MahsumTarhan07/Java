package OrnekProjeler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class notortalamas� {

	public static void main(String[] args) {
		
		double not  = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("L�tfen Notunuz Girin");
		
		try {
			not = Double.parseDouble(br.readLine());
		}catch(NumberFormatException e) {
			System.out.println("Klaveye Okuma Hatas�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(not<0) {
			System.out.println("Hatal� Not");
		}else if(not<=50) {
			System.out.println("Kald� (1)");
		}else if(not<=60) {
			System.out.println("Gecti (2)");
		}else if(not <=75) {
			System.out.println("Orta (3)");
		}else if(not <=90) {
			System.out.println("�yi (4)");
		}else if(not<=100) {
			System.out.println("Pek �yi (5)");
		}else {
			System.out.println("Bilinmeyen Bir Hata");
		}
	
	}

}
