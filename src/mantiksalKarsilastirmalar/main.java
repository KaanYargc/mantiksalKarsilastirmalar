package mantiksalKarsilastirmalar;

public class main {

	public static void main(String[] args) {
		double product1=12.99;
		double product2=12.99;
		//eþit prouduct eþit ise proudctr2
		if(product1==product2) {
			System.out.println("eþit");
		}
		//prouduct1 ucuz prouduct1 küçük ise prouduct2
		if(product2<product1) {
			System.out.println("1. ürün küçük");
		}
		//profuct2 product ucuz product2 küük ise product1
		if(product1>product2) {
			System.out.println("2. ürün küçük");
			
		}
		
		
		//yuz ifadeleri  baslangýc
		
		String yuzIfadesi="MutLu";
		if(yuzIfadesi=="mutlu"||yuzIfadesi=="MUtlu"||yuzIfadesi=="MUTLU") {
			System.out.println("(:");
		}
		
	
		if(yuzIfadesi=="üzgün"||yuzIfadesi=="ÜZgün"||yuzIfadesi=="ÜZGÜN") {
		System.out.println("):");	
			
			}
		//yüz ifadeleri bitiþ

	}

}
