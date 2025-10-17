package polymporphism.ProviderCode;

public class Frog extends Animal {
	
	private int jumpCount;
	
	public Frog(String _name) {
		super(_name);
		jumpCount = 0;
	}
	
	@Override
	public void jump() {
		jumpCount++;
		System.out.
		println(name + " số lần nhảy: " + jumpCount);
		
	}

}
