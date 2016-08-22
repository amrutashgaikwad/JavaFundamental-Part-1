package executor;

import printing.BWCartridge;
import printing.ColorCartridge;
import printing.Printer;

public class MainClass {

	public static void main(String[] args) {
		Printer<ColorCartridge> color_Printer = new Printer<ColorCartridge>(true, "A12", new ColorCartridge());
		Printer<BWCartridge> bw_Printer = new Printer<BWCartridge>(false, "A11", new BWCartridge());		
		
		color_Printer.print();
		System.out.println("-------");
		bw_Printer.print();
	}

}
