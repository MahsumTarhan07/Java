package OrnekProjeler;

public class ikisayýnýnyerinideðiþtirne {

	public static void main(String[] args) {

		float birinci = 1.20f;
		float ikinci  = 2.45f;
		
		System.out.println("--DEÐÝÞTÝRMEDEN ONCE--");
		System.out.println("Birinci sayý :" + birinci);
		System.out.println("Ýkinci Sayý :" + ikinci);
		
		// floatla gecici bir deðiþken tanýmladýk ondan sonra
		// yerleri deðiþtirdik.
		
		float gecici = birinci;
		birinci = ikinci;
		ikinci = gecici;
		
		System.out.println("--DEÐÝÞTÝRMEDEN SONRA--");
		System.out.println("Birinci sayý :" + birinci);
		System.out.println("Ýkinci Sayý :" + ikinci);
		
	}

}
