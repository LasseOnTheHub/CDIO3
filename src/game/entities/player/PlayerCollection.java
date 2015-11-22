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
        Car[]    cars    = new Car[2];
        Player[] players = new Player[2];

        cars[0] = new Car.Builder()
                .primaryColor(Color.MAGENTA)
                .secondaryColor(Color.BLUE)
                .patternFill()
                .typeRacecar()
                .build();

        cars[1] = new Car.Builder()
                .primaryColor(Color.BLACK)
                .secondaryColor(Color.RED)
                .patternDotted()
                .typeUfo()
                .build();

        for (int i = 0; i < names.length; i++)
        {
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
