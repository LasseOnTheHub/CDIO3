package game.entities.fields;

import game.entities.fields.FieldItem;
import game.controllers.LanguageController;

public class FieldCollection {
	private FieldItem[] fields;
	
	public static FieldCollection initialize(LanguageController language)
	{
		FieldItem[] fields = new FieldItem[11];
		
		fields[0]  = new FieldItem(language.getText("FIELD_0"), language.getText("FIELD_0_DESC"),  250);
		fields[1]  = new FieldItem(language.getText("FIELD_1"), language.getText("FIELD_1_DESC"),  -10);
		fields[2]  = new FieldItem(language.getText("FIELD_2"), language.getText("FIELD_2_DESC"),  100);
		fields[3]  = new FieldItem(language.getText("FIELD_3"), language.getText("FIELD_3_DESC"),  -20);
		fields[4]  = new FieldItem(language.getText("FIELD_4"), language.getText("FIELD_4_DESC"),  180);
		fields[5]  = new FieldItem(language.getText("FIELD_5"), language.getText("FIELD_5_DESC"),  0);
		fields[6]  = new FieldItem(language.getText("FIELD_6"), language.getText("FIELD_6_DESC"),  -70);
		fields[7]  = new FieldItem(language.getText("FIELD_7"), language.getText("FIELD_7_DESC"),  60);
		fields[8]  = new FieldItem(language.getText("FIELD_8"), language.getText("FIELD_8_DESC"),  -80, true);
		fields[9]  = new FieldItem(language.getText("FIELD_9"), language.getText("FIELD_9_DESC"),  -50);
		fields[10] = new FieldItem(language.getText("FIELD_10"), language.getText("FIELD_10_DESC"), 650);

		return new FieldCollection(fields);	
	}
	
	public FieldCollection(FieldItem[] fields) {
		this.fields = fields;
	}
	
	public FieldItem getField(int fieldIndex) {
		return fields[fieldIndex];
	}
	
	public int getFieldCount() {
		return fields.length;
	}
}
