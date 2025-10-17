package polymporphism.ProviderCode;

public class Animal {
	protected String name;
	
	protected Animal() {
		
	}
	
	protected Animal(String _name) {
		name = _name;
	}
	
	public void jump() {
		System.out.println("Jumping ...");
	}
}
