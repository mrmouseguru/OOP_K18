package toan_tu_this;

public class Account {
	private int a;
	private int b;
	
	void set(int a, int b)
	{
		/*account*/ this.a = a ;//a: biến cục bộ của hàm
		/*account*/ this.b = b;//b: biến cục bộ của hàm
	}
	
	void show() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
