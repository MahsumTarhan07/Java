package OrnekProjeler;

import java.util.Scanner;

import javax.swing.JOptionPane;

import static java.lang.System.out;
import static java.lang.System.in;


public class hipotenüs_hesaplama {

	public static void main(String[] args) {

		double a;
		int b,c;
		System.out.println("Gir , Kenarlýk \n");
		Scanner tara = new Scanner(System.in);
		
		b = tara.nextInt();
		c = tara.nextInt();
		
		a  = Math.sqrt(b*b + c * c);
		
		System.out.print("Hipotenüs :" + a);
		
		
	}

}
