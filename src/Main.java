
public class Main {

	public static void main(String[] args) {
		
		Otomobil otomobil1= new Otomobil();
		
		otomobil1.cant= "kırmızı";
		
		System.out.println(otomobil1.getBoy() + " "+ otomobil1.getEn()+ " "+ otomobil1.getModel());
		
		Otomobil otomobil2= new Otomobil();
		otomobil2.cant= "mavi";
		
		
		System.out.println(otomobil2.getBoy()+ " " + otomobil2.getEn()+ " " + otomobil2.getModel());
	}

}
