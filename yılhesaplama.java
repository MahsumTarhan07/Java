package OrnekProjeler;

public class y�lhesaplama {

	public static void main(String[] args) {
	
		 int yil = 2022;
	        boolean artik = false;
	 
	        if(yil % 4 == 0)
	        {
	            if( yil % 100 == 0)
	            {
	                if ( yil % 400 == 0)
	                    artik = true;
	                else
	                    artik = false;
	            }
	            else
	                artik = true;
	        }
	        else
	            artik = false;
	 
	        if(artik)
	            System.out.println(yil + " art�k y�ld�r.");
	        else
	            System.out.println(yil + " art�k y�l de�ildir.");
	    } 

}
