package game.entities.dice;

public class DiceCup {

	Die[] Dice;

	public DiceCup(Die[] Dice) {
		this.Dice = Dice;
	}

	public static DiceCup initialize()
	{
		Die Die = new Die(new int[] {1,2,3,4,5,6});
		DiceCup DiceCup = new DiceCup(new Die[] {Die,Die});
		return DiceCup;
		
	}
	public int[] roll() {
		int[] rollresults = new int[Dice.length];
		for (int n = 0; n <= this.Dice.length - 1; n++) {
			int[] possibleoutcomes = this.Dice[n].getNumbers();
			int specifier = (int) (Math.random() * possibleoutcomes.length);
			rollresults[n] = possibleoutcomes[specifier];
		}
		return rollresults;
	}

}
