package OrnekProjeler;

public class overload�ngMetot {

	static void topla(int a, int b) {
		System.out.println("2 say�n�n toplam� = " + (a + b));
	}
	static void topla (int a , int b , int c) {
		System.out.println("3 say�n�n toplam� = " + (a + b + c));
	}
	static void topla (int a , int b, int c, int d) {
		System.out.println("4 say�n�n toplam� = " + (a + b + c + d));
	}
	
	
	public static void main(String[] args) {
		topla(5,6);
		topla(1,6,8);
		topla(7,9,5,9);
	}

}
