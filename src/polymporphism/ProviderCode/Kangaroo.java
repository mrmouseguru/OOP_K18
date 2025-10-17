package polymporphism.ProviderCode;

public class Kangaroo extends Animal{
	private double jumpDistance;
	
	public Kangaroo(String _name,
			double _jumpDistance) {
		super(_name);
		jumpDistance = _jumpDistance;
	}
	
	@Override
	public void jump() {
		System.
		out.print("Kangaoo name: " +
		name + " jump " + jumpDistance + "m");
	}
}
