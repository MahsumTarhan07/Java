package OrnekProjeler;

public class �csay�danb�y�kolan {

	public static void main(String[] args) {

		double n1 = -5 , n2 = 11.4, n3 = 5;
		
		System.out.println("...Say�lar:");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		if(n1 >=n2 && n1 >=n3) {
			System.out.println(n1 + "Say�s� B�y�kt�r");
		}else if(n2>=n1 && n2>=n3) {
			System.out.println(n2 + "Say�s� B�y�kt�r");
		}else if(n3>n1 && n3>=n2) {
			System.out.println(n3 + "Say�s� B�y�kt�r");
		}

	}

}
