package OrnekProjeler;

public class ikisay�n�nyerinide�i�tirne {

	public static void main(String[] args) {

		float birinci = 1.20f;
		float ikinci  = 2.45f;
		
		System.out.println("--DE���T�RMEDEN ONCE--");
		System.out.println("Birinci say� :" + birinci);
		System.out.println("�kinci Say� :" + ikinci);
		
		// floatla gecici bir de�i�ken tan�mlad�k ondan sonra
		// yerleri de�i�tirdik.
		
		float gecici = birinci;
		birinci = ikinci;
		ikinci = gecici;
		
		System.out.println("--DE���T�RMEDEN SONRA--");
		System.out.println("Birinci say� :" + birinci);
		System.out.println("�kinci Say� :" + ikinci);
		
	}

}
