package game.entities.fields;

import game.entities.player.Player;

public class LaborCamp extends Ownable
{
	private int baseRent=100;

	public LaborCamp(String titel, int position, int price, boolean isReThrow)
	{
		super(titel, position, price, isReThrow);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void landOnField(Player player)
	{
		
		super.landOnField(player);
	}
	
}
