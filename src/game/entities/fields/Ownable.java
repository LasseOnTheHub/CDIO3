package game.entities.fields;

import game.entities.player.Player;

abstract class Ownable extends Field
{
	protected int price;
	protected Player owner;
	protected boolean isReThrow;
	
	
	
	public Ownable(String titel, int position, int price, boolean isReThrow)
	{
		super(titel, position);
		this.price = price;
		this.isReThrow = isReThrow;
		// TODO Auto-generated constructor stub
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public Player getOwner()
	{
		return owner;
	}
	public void setOwner(Player owner)
	{
		this.owner = owner;
	}

}
