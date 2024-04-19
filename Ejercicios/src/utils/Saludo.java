package utils;

public class Saludo {
	
	String name;
	
	public Saludo(String name) {
		this.name = name;
	}
	
	public String getGreeting() {
		return "Hello " + this.name + "!";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
