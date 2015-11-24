package game.entities.fields;

public class Fleet extends Ownable
{
	final private int RENT_1 = 500;
	final private int RENT_2 = 1000;
	final private int RENT_3 = 2000;
	final private int RENT_4 = 4000;
	public Fleet(String titel, int position, int price, boolean isReThrow)
	{
		super(titel, position, price, isReThrow);
		
	}
	
	
}
