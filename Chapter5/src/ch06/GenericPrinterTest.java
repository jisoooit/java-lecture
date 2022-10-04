package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Powder powder = new Powder();
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(powder);
		
		Powder p = powderPrinter.getMaterial();
		System.out.println(powderPrinter.toString());
		
	}

}
