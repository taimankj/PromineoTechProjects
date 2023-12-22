package Week6FinalProject;

public class Card {
	private int value;
	private String name;
	
	public Card(String name, int value) {
		this.setName(name);
		this.setValue(value);
	}
	
	public void describe() {
		System.out.println("Card: " + name + ", Value: " + value);
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
