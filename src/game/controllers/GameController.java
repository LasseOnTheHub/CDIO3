package game.controllers;

import game.entities.dice.DiceCup;
import game.entities.fields.FieldCollection;
import game.entities.fields.FieldItem;
import game.entities.player.Account;
import game.entities.player.Player;
import game.entities.player.PlayerCollection;

public class GameController
{

    private DiceCup cup;
    private GuiController gui;
    private FieldCollection fields;
    private PlayerCollection players;

    public GameController(GuiController gui, PlayerCollection players, FieldCollection fields, DiceCup cup)
    {
        this.cup     = cup;
        this.gui     = gui;
        this.fields  = fields;
        this.players = players;
    }

    public void start()
    {
        boolean finished = false;

        this.gui.prepare();

        while (!finished)
        {
            boolean rethrow = false;

            /*
             * Fetch the current player
             */
            Player player   = this.players.getCurrentPlayer();
            Account account = player.getAccount();
            
            int[] points = this.cup.roll();
            int position = (points[0] + points[1] - 2)+(player.getCurrentFieldPosition().getPosition());



            /*
             * Fetch the current field
             */
            //FieldItem field = this.fields.getField(position);
            game.entities.fields.Field field = this.fields.getField(position);




            this.gui.update(points, position, field, this.players.getCurrentPlayer());

            if(!finished || !rethrow)
            {
                this.players.nextPlayer();
            }
        }

        this.gui.finish(this.players.getCurrentPlayer());
    }

}