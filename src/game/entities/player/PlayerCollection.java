package game.entities.player;

import java.awt.Color;
import desktop_codebehind.Car;
import desktop_resources.GUI;

public class PlayerCollection 
{
    private Player[] players;
    private int      currentIndex = 0;

    public static PlayerCollection initialize(String[] names, int balance)
    {
        Car[]    cars    = new Car[names.length];
        Player[] players = new Player[names.length];


        for (int i = 0; i < names.length; i++)
        {
        	cars[i] = new Car.Builder()
                    .primaryColor(Color.MAGENTA)
                    .secondaryColor(Color.BLUE)
                    .patternFill()
                    .typeRacecar()
                    .build();
        	
            players[i] = new Player(names[i], new Account(balance));
            GUI.addPlayer(
                players[i].getName(), 
                players[i].getAccount().getBalance(), 
                cars[i]
            );
        }

        return new PlayerCollection(players);
    }

    public PlayerCollection(Player[] players)
    {
        this.players = players;
    }

    public Player getCurrentPlayer()
    {
        return players[currentIndex];
    }

    public void nextPlayer()
    {
        if (currentIndex + 1 < players.length)
        {
            currentIndex++;
        } else
        {
            currentIndex = 0;
        }
    }

}
