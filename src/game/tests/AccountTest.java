package game.tests;

import game.entities.player.Account;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest
{

    @Test
    public void testCanGetBalance()
    {
        Account account = new Account(1000);
        assertEquals(account.getBalance(), 1000);
    }

    @Test
    public void testCanAddToBalance()
    {
        Account account = new Account(1000);
        account.changeBalance(200);
        assertEquals(account.getBalance(), 1200);
    }

    @Test
    public void testCanRemoveFromBalance()
    {
        Account account = new Account(1000);
        account.changeBalance(-200);
        assertEquals(account.getBalance(), 800);
    }

    @Test
    public void testBalanceCannotBeNegative()
    {
        Account account = new Account(1000);
        assertEquals(account.changeBalance(0), false);
    }

}
