package game.entities.fields;

public class Tax extends Field
{
	private int taxAmount;
	private int taxRate;
	
	public Tax(String titel, int position, int taxAmount,int taxRate)
	{
		super(titel, position);
		this.taxAmount = taxAmount;
		this.taxRate = taxRate;
	}
	
}
