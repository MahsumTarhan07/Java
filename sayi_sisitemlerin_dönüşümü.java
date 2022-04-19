package OrnekProjeler;

public class sayi_sisitemlerin_dönüþümü {

	public static void main(String[] args) {

		int b=1 ,c=2;
		
		int d = b&c;
		int e = b|c;
		int f = c>>1;
		int g = c>>2;
		
		System.out.println(" b    =" + b);
		System.out.println(" c    =" + Integer.toBinaryString(c));
		System.out.println(" b&c  =" + Integer.toBinaryString(d));
		System.out.println(" b|c  =" + Integer.toBinaryString(e));
		System.out.println(" c>>1 =" + Integer.toBinaryString(f));
		System.out.println(" c>>2 =" + Integer.toBinaryString(g));
	
	}

}
