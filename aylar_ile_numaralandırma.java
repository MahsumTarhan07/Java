package OrnekProjeler;

import java.util.Scanner;

public class aylar_ile_numaralandýrma {

	public static void main(String[] args) {
		
		System.out.println("Enter a number between 1-12 to finf the month");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.println(" " + getMonthName(n));
		
	}

	public static String getMonthName(int monthDecimal) {
		String [] months  = {"0","January","february","march","april","may","june","july","august","september","october","november","december"};	
		return months[monthDecimal];
	}
}
