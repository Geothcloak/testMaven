package justin.testMaven;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DicePrinterTest {
	DicePrinter dicePrinter;
	
	@Before
	public void init(){
		DiceRoller diceRoller = new DiceRoller();
		dicePrinter = new DicePrinter(diceRoller);
	}
	@Test
	public void canPrintDice(){
		//dicePrinter.printDice(100);
		 
		Assert.assertEquals("6", dicePrinter.printDice(1).get(0));
	}
}
