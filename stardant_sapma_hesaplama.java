package OrnekProjeler;

public class stardant_sapma_hesaplama {

	public static void main(String[] args) {
		double[] dizi = {1,2,3,4,5,6,7,8,9,10};
		double StandartSapma = Hesapla(dizi);
		
		System.out.println("Sayilar :");
		
		for(double sayi : dizi) {
			System.out.println("\N Sayilar�n Stardant Sapmaas� = %.6f \n", StardanSapma);
		}

	}

}
