package game.entities.fields;

import game.entities.player.Player;

public class Terretorty extends Ownable
{
	private int rent;

	public Terretorty(String titel, int position, int price, boolean isReThrow,int rent)
	{
		super(titel, position, price, isReThrow);
		this.rent = rent;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void landOnField(Player player)
	{
		if (this.owner!=null)
		{
			player.getAccount().changeBalance(-rent);
			this.getOwner().getAccount().changeBalance(rent);
		}
		else {
			
		}
	}
	
	public int getRent()
	{
		return rent;
	}

	public void setRent(int rent)
	{
		this.rent = rent;
	}
	
	

	
}
