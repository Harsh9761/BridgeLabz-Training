
public class MobilePhone {
	String brand;
	String model;
	double price;
	
	public MobilePhone(String brand,String model,double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void DisplayDetails() {
		System.out.println("Brand of mobile: "+brand);
		System.out.println("Model of mobile: "+model);
		System.out.println("price of mobile: "+price);
	}
	
	public static void main(String[] args) {
		MobilePhone phone1 = new MobilePhone("VIVO","Vivo 15 pro",15999);
		MobilePhone phone2 = new MobilePhone("Oppo","Oppo 19 pro",25999);
		MobilePhone phone3 = new MobilePhone("Oneplus","Oneplus 16",65999);
		System.out.println("Phone Details\n");
		phone1.DisplayDetails();
		phone2.DisplayDetails();
		phone3.DisplayDetails();

	}

}
