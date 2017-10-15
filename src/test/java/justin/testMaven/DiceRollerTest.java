package justin.testMaven;

import org.junit.Before;
import org.junit.Test;


public class DiceRollerTest {
	DiceRoller diceRoller;
	@Before
	public void init(){
		diceRoller = new DiceRoller();
	}
	@Test
	public void canDiceRoll(){
		System.out.println(diceRoller.roll());
	}
	
}
