package OrnekProjeler;

public class yýlhesaplama {

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
	            System.out.println(yil + " artýk yýldýr.");
	        else
	            System.out.println(yil + " artýk yýl deðildir.");
	    } 

}
