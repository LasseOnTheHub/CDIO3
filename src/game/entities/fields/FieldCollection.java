package game.entities.fields;

import game.entities.fields.FieldItem;
import game.controllers.LanguageController;

public class FieldCollection {
	private Field[] fields;
	
	public static FieldCollection initialize(LanguageController language)
	{
		Field[] fields = new Field[21];
//		
//		fields[0]  = new FieldItem(language.getText("FIELD_0"), language.getText("FIELD_0_DESC"),  250);
//		fields[1]  = new FieldItem(language.getText("FIELD_1"), language.getText("FIELD_1_DESC"),  -10);
//		fields[2]  = new FieldItem(language.getText("FIELD_2"), language.getText("FIELD_2_DESC"),  100);
//		fields[3]  = new FieldItem(language.getText("FIELD_3"), language.getText("FIELD_3_DESC"),  -20);
//		fields[4]  = new FieldItem(language.getText("FIELD_4"), language.getText("FIELD_4_DESC"),  180);
//		fields[5]  = new FieldItem(language.getText("FIELD_5"), language.getText("FIELD_5_DESC"),  0);
//		fields[6]  = new FieldItem(language.getText("FIELD_6"), language.getText("FIELD_6_DESC"),  -70);
//		fields[7]  = new FieldItem(language.getText("FIELD_7"), language.getText("FIELD_7_DESC"),  60);
//		fields[8]  = new FieldItem(language.getText("FIELD_8"), language.getText("FIELD_8_DESC"),  -80, true);
//		fields[9]  = new FieldItem(language.getText("FIELD_9"), language.getText("FIELD_9_DESC"),  -50);
//		fields[10] = new FieldItem(language.getText("FIELD_10"), language.getText("FIELD_10_DESC"), 650);

		fields[0] = new Terretorty("Tribe Encampment",1,1000,false,100);
		fields[1] = new Terretorty("Crater",2,1500,false,300);
		fields[2] = new Terretorty("Mountain",3,2000,false,500);
		fields[3] = new Terretorty("Cold Desert",4,3000,false,700);
		fields[4] = new Terretorty("Black Cave",5,4000,false,1000);
		fields[5] = new Terretorty("The Werewall",6,4300,false,1300);
		fields[6] = new Terretorty("Mountain Village",7,4750,false,1600);
		fields[7] = new Terretorty("South Citadel",8,5000,false,1000);
		fields[8] = new Terretorty("Palace gates",9,5500,false,2600);
		fields[9] = new Terretorty("Tower",10,6000,false,3200);
		fields[10] = new Terretorty("Castle",11,8000,false,4000);
		fields[11] = new Refugee("Walled City", 12, 5000);
		fields[12] = new Refugee("Monestary", 13, 500);
		fields[13] = new LaborCamp("Huts in the mountain", 14, 2500, false);
		fields[14] = new LaborCamp("The Pit", 15, 2500, false);
		fields[15] = new Tax("Goldmine", 16, 2000,0);
		fields[16] = new Tax("Caravan", 17, 4000,10);
		fields[17] = new Fleet("Second Sail", 18, 4000, false);
		fields[18] = new Fleet("Sea Grover", 19, 4000, false);
		fields[19] = new Fleet("The Buccaneers", 20, 4000, false);
		fields[20] = new Fleet("Privateer armade", 21, 4000, false);
		
		return new FieldCollection(fields);	
	}
	
	public FieldCollection(Field[] fields) {
		this.fields = fields;
	}
	
	public Field getField(int fieldIndex) {
		return fields[fieldIndex];
	}
	
	public int getFieldCount() {
		return fields.length;
	}
}
