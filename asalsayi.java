package OrnekProjeler;

public class asalsayi {

	public static void main(String[] args) {
	/*
		int count = 0;
		int num = 2; // asal say�ar 2den ba�lar
		
		while(count<50) {
			boolean isPrime = true;
			
			for(int i = 2; i<num; i++) {
				if(num % i == 0) { // bolumne biliyorsa asal say� de�il
					isPrime = false;
				}
			}
			
			if(isPrime) {
				count++;
				if(count%10==0) { // 10 tane yazd�rl�rsa alt sa
					System.out.println(num);
				}else {
					System.out.println(num + "");
				}
			}
			num++;
		}
		*/
		
		int x = 30;
		int y = 10;
		int  z = (x * y++);
		System.out.println(z);
		
		int m = x*++y;
		System.out.print(m);

		
	
	}

}
