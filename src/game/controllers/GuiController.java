package game.controllers;
import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;
import game.entities.fields.FieldCollection;
import game.entities.fields.FieldItem;
import game.entities.player.*;


public class GuiController {

	LanguageController language;
	
	
	public GuiController(LanguageController lang) {
		this.language = lang;
		
	}
	
	public static GuiController initialize(LanguageController lang, FieldCollection fieldCollection) {
		
		int count = fieldCollection.getFieldCount();
	
		Field[] guiFields = new Field[count];
		
		for (int i = 0; i < guiFields.length; i++) {
		
		game.entities.fields.Field field = fieldCollection.getField(i);
			
		guiFields[i] = new Street.Builder()
						.setTitle(field.getTitel())
						.setSubText(Integer.toString(field.getPosition()))
						//.setDescription(field.getDescription())
						.build();
		}
		
		GUI.create(guiFields);
		GUI.setDice(4, 90, 1, 270);
		
		return new GuiController(lang);
	}
	
	
	public void prepare(){
		
		GUI.getUserButtonPressed(language.getText("welcome_msg"), language.getText("start_button"));
		
	}
	
	public void finish(Player player) {
		
		GUI.showMessage(String.format("Player %s has won the game", player.getName()));
		
	}
	
	public String requestPlayerName() {
		
		return GUI.getUserString(language.getText("request_player_name"));
		
	}
	public void showMessage(String message)
	{
		GUI.showMessage(message);
	}
	
	public int getInteger()
	{
		return GUI.getUserInteger("Vælg antal spillere", 2, 6);
	}

	public void update(int[] diceResults, int newPosition, game.entities.fields.Field field, Player player) {
		
		/*
		 * set dice and update balance
		 */
		
		GUI.setDice(diceResults[0], diceResults[1]);
		
		GUI.setBalance(player.getName(), player.getAccount().getBalance());
		
		/*
		 * move player car
		 */
		
		GUI.removeAllCars(player.getName());
		
		GUI.setCar(newPosition + 1, player.getName());
		
		/*
		 * display title and description in the chance card area.
		 */
		
		//GUI.setChanceCard(field.getTitel() + " - " + field.getDescription());
		//GUI.displayChanceCard();
		
		GUI.getUserButtonPressed(language.getText("ready_next"), language.getText("roll_button"));
		
	}
	
	public void removePlayerFromBoard(Player player)
	{
		GUI.removeCar(player.getCurrentFieldPosition().getPosition(),player.getName());
	}
	
	public void close()
	{
	    GUI.close();
	}
	
}
