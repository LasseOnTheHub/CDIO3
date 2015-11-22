package game.entities.player;

public class Account 
{
    private int balance;
    private static final int MIN_BALANCE = 0;

    public Account(int balance)
    {
        if (balance >= MIN_BALANCE)
        {
            this.balance = balance;
        } 
        else
        {
            this.balance = MIN_BALANCE;
        }
    }

    public int getBalance()
    {
        return this.balance;
    }

    public boolean changeBalance(int amount)
    {
        if (amount == 0)
        {
            return false;
        }

        this.balance += amount;

        if (balance < MIN_BALANCE)
        {
            this.balance = MIN_BALANCE;
        }

        return true;
    }

    public String toString()
    {
        return Integer.toString(this.balance);
    }
}
