package game.entities.player;

public class Player
{
    private String name;
    private Account account;

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
