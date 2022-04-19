package OrnekProjeler;

public class ücsayýdanbüyükolan {

	public static void main(String[] args) {

		double n1 = -5 , n2 = 11.4, n3 = 5;
		
		System.out.println("...Sayýlar:");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		if(n1 >=n2 && n1 >=n3) {
			System.out.println(n1 + "Sayýsý Büyüktür");
		}else if(n2>=n1 && n2>=n3) {
			System.out.println(n2 + "Sayýsý Büyüktür");
		}else if(n3>n1 && n3>=n2) {
			System.out.println(n3 + "Sayýsý Büyüktür");
		}

	}

}
