package vcubeprojects;

public class Mobile {
	static String companyName = "OnePlus";
	
	String brand;
	String model;
	int price;
	int ram;
	
	static {
		System.out.println("Mobile created");
	}
	void mobile() {
		System.out.println("brand: "+ brand);
		System.out.println("model: "+ model);
		System.out.println("Price: "+ price);
		System.out.println("Ram: "+ ram+"GB");
		System.out.println();
		
	}
	


	public static void main(String[] args) {
		
		System.out.println("CompanyName: "+companyName);
		
		Mobile m1 = new Mobile();
		m1.brand = "flag series";
		m1.model = "Oneplus 12";
		m1.price = 40000;
		m1.ram = 12;
		
		
		Mobile m2 = new Mobile();
		m2.brand = "Nord series";
		m2.model = "Oneplus Nord 3";
		m2.price = 35000;
		m2.ram = 12;
		
		
		Mobile m3 = new Mobile();
		m3.brand = "fold series";
		m3.model = "Oneplus 11R";
		m3.price = 75000;
		m3.ram = 16;
		
		m1.mobile();
		m2.mobile();
		m3.mobile();
		
		
		
		
		
		
		

	}

}
