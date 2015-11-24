package game;

import game.controllers.GuiController;
import game.controllers.GameController;
import game.controllers.LanguageController;

import game.entities.dice.DiceCup;
import game.entities.fields.FieldCollection;
import game.entities.player.PlayerCollection;

public class Run
{
    public static void main(String[] args)
    {
        LanguageController language = new LanguageController("da");
        int numberOfPlayers;
        
        FieldCollection    fields = FieldCollection.initialize(language);
        GuiController      gui    = GuiController.initialize(language, fields);

        /*
         * Fetch player names from the GUI
         */
        numberOfPlayers = gui.getInteger();
        String[] names = new String[numberOfPlayers];
        
        for (int i = 0; i < numberOfPlayers; i++)
		{
        	 names[i] += gui.requestPlayerName();
		}
        

        PlayerCollection players = PlayerCollection.initialize(names, 30000);

        DiceCup        cup  = DiceCup.initialize();
        GameController game = new GameController(gui, players, fields, cup);

        /*
         * When this method call ends the game has also finished.
         * Then close the GUI.
         */
        game.start();
        gui.close();
    }
}