package OrnekProjeler;

public class ilkprojesi {

	public static void main(String[] args) {
	
		int a = 5;
		int b = 4;
		int c = 3;
		
		boolean x,y,z;
		
		x =   (a >= 0) && (b==c); // && and her iki sart dogru olmas� gerek demektir
		y =   (a >= 0) || (b==c); // || veya ikisinde birisi dogru ise cal��acak kod
		z =  !(c > a) ^ (b<=c);   // ^ (xor) mat�ksal ozel veya  opart�rleri
		System.out.print("x="+ x + "\ny="+ y + "\nz=" + z );
		
		
	}

}
