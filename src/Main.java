
public class Main {
	
	public static void main(String[] args) {
		int[] arr = {10,20,30,80,100,200};
		Integer[] arrB = {10,20,30,80,100,200};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr"+i+"="+arr[i]);
		}
		
		mehmetFonksiyon("HalilCakmak",5678,arrB);
 	}
	
	
	public static void mehmetFonksiyon(String isim,Integer uzunluk,Integer[] aaa) {
		System.out.println("Mehmet'in fonksiyonu çaðrýldý");
		
		System.out.println("isimaaaaaa : "+isim+",uzunllllluk : "+uzunluk);
	}

}

