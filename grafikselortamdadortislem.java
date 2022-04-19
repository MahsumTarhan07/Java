package OrnekProjeler;

import javax.swing.JOptionPane;

public class grafikselortamdadortislem {

	public static void main(String[] args) {

		String s;
		float s1, s2;
		double toplam ,cikarma, carpma, bolme;
		s1 = Float.parseFloat(JOptionPane.showInputDialog("1 Sayi Giriniz"));
		s2 = Float.parseFloat(JOptionPane.showInputDialog("2 Sayi Giriniz"));
		toplam = s1 + s2;
		cikarma = s1 - s2;
		carpma = s1  *  s2;
		bolme = s1 * s2;
		
		bolme = (float) s1 / s2;
		
		s =  s + s1 + " + " + s2 + " = " + toplam + "\n";
		s =  s + s1 + " - " + s2 + " = " + cikarma + "\n";
		s =  s + s1 + " * " + s2 + " = " + carpma + "\n";
		s =  s + s1 + " / " + s2 + " = " + toplam + "\n";
		
		JOptionPane.showMessageDialog(null, s, "HESAP MAKÝNASI" , 1);

		
	}

}
