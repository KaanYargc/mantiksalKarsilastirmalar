package mantiksalKarsilastirmalar;

public class main {

	public static void main(String[] args) {
		double product1=12.99;
		double product2=12.99;
		//e�it prouduct e�it ise proudctr2
		if(product1==product2) {
			System.out.println("e�it");
		}
		//prouduct1 ucuz prouduct1 k���k ise prouduct2
		if(product2<product1) {
			System.out.println("1. �r�n k���k");
		}
		//profuct2 product ucuz product2 k��k ise product1
		if(product1>product2) {
			System.out.println("2. �r�n k���k");
			
		}
		
		
		//yuz ifadeleri  baslang�c
		
		String yuzIfadesi="MutLu";
		if(yuzIfadesi=="mutlu"||yuzIfadesi=="MUtlu"||yuzIfadesi=="MUTLU") {
			System.out.println("(:");
		}
		
	
		if(yuzIfadesi=="�zg�n"||yuzIfadesi=="�Zg�n"||yuzIfadesi=="�ZG�N") {
		System.out.println("):");	
			
			}
		//y�z ifadeleri biti�

	}

}
