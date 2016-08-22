package printing;

public class Printer<T> 
{
	private String modelNumber;
	private boolean printer_isON;
	private T cartridge;
	
	public Printer(boolean isON, String modelNumber, T cartridge ) {
		this.modelNumber = modelNumber;
		this.printer_isON = isON;
		this.cartridge = cartridge;
	}

	public void print()
	{
		System.out.println(cartridge.toString());
		String onStatus = "";
		if(printer_isON)
			System.out.println("Printer is ON");
		else
			System.out.println("Printer is OFF");
	}
}
