package game.entities.player;

import game.entities.fields.Field;

public class Player
{
    private String name;
    private Account account;
    private Field ownedFields;
    private boolean active;
    private Field currentFieldPosition;

    public Field getCurrentFieldPosition()
	{
		return currentFieldPosition;
	}

	public void setCurrentFieldPosition(Field currentFieldPosition)
	{
		this.currentFieldPosition = currentFieldPosition;
	}

	public Field getOwnedFields()
	{
		return ownedFields;
	}

	public void setOwnedFields(Field ownedFields)
	{
		this.ownedFields = ownedFields;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Player(String name, Account account)
    {
        this.name = name;
        this.account = account;
    }

    public String getName()
    {
        return this.name;
    }

    public Account getAccount()
    {
        return this.account;
    }

    public String toString()
    {
        return "Spillerens navn: " + this.name + ". Spillerens balance: " + this.account;
    }
}
