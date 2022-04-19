package OrnekProjeler;

import javax.swing.JOptionPane;

public class uyarý_pencerleri {

	public static void main(String[] args) {
		/*
		String ileti = "Kurs Öðrencileri : \n" + "1 : Remzi Karakoc\n" + " 2 :Sabahatin Üzülmez\n" ;
		
		JOptionPane.showMessageDialog(null, ileti, "Java Kursu" 1);
		*/
		
		String s1 = JOptionPane.showInputDialog(null, "1 : Sayi Giriniz");
		String s2 = JOptionPane.showInputDialog(null, "2 : Sayi Giriniz");
		
		int toplam = Integer.parseInt(s1) + Integer.parseInt(s2);
		
		JOptionPane.showMessageDialog(null, " Sayilarin Toplamý  =" + toplam);

	}

}
