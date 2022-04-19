package OrnekProjeler;

public class diziortalmasýhesaplama {

	public static void main(String[] args) {


		double [] dizi = {12.3, 7.7, 10,46, 45.5, 55.5, -21,05};
		double toplam = 0.0;
		
		for(double sayi : dizi) {
			toplam +=sayi;
		}
		
		double ortalma = toplam / dizi.length;
		System.out.format("Dizinin Ortalamasi : %.2f", ortalma);
		System.out.println();
		
	}

}
