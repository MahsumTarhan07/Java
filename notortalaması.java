package OrnekProjeler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class notortalamasý {

	public static void main(String[] args) {
		
		double not  = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Lütfen Notunuz Girin");
		
		try {
			not = Double.parseDouble(br.readLine());
		}catch(NumberFormatException e) {
			System.out.println("Klaveye Okuma Hatasý");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(not<0) {
			System.out.println("Hatalý Not");
		}else if(not<=50) {
			System.out.println("Kaldý (1)");
		}else if(not<=60) {
			System.out.println("Gecti (2)");
		}else if(not <=75) {
			System.out.println("Orta (3)");
		}else if(not <=90) {
			System.out.println("Ýyi (4)");
		}else if(not<=100) {
			System.out.println("Pek Ýyi (5)");
		}else {
			System.out.println("Bilinmeyen Bir Hata");
		}
	
	}

}
