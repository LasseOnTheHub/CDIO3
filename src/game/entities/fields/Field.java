package game.entities.fields;

import game.entities.player.Player;

public class Field 
{
	protected String titel;
	protected int position=0;
	
	
	
	public Field(String titel, int position)
	{
		super();
		this.titel = titel;
		this.position = position;
	}

	public void landOnField(Player player)
	{
		
	}

	public String getTitel()
	{
		return titel;
	}

	public void setTitel(String titel)
	{
		this.titel = titel;
	}

	public int getPosition()
	{
		return position;
	}

	public void setPosition(int position)
	{
		this.position = position;
	}
	
	

}
