package justin.testMaven;

import java.util.ArrayList;
import java.util.List;

public class DicePrinter {
	DiceRoller diceRoller;
	public DicePrinter(DiceRoller diceRoller){
		this.diceRoller = diceRoller;
	}
	public List<String> printDice(int numberOfRolls){
		List<String> rolls = new ArrayList<String>();
		for(int i = 0; i < numberOfRolls; i++){
			
			rolls.add(Integer.toString(diceRoller.roll()));
			
			System.out.println(rolls.get(i));
		}
		return rolls;
	}
}
