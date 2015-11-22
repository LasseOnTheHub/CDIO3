package game.entities.fields;

public class FieldItem {
	private String title;
	private String description;
	private int value;
	private boolean rethrow;
	
	public FieldItem(String title, String description, int value) {
		this.title = title;
		this.description = description;
		this.value = value;
	}
	
	public FieldItem(String title, String description, int value, boolean rethrow) {
		this.title = title;
		this.description = description;
		this.value = value;
		this.rethrow = rethrow;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public boolean isRethrowAvailable() {
		return this.rethrow;
	}
}
