package polymporphism;

import polymporphism.ProviderCode.Animal;
import polymporphism.ProviderCode.Frog;
import polymporphism.ProviderCode.Kangaroo;

public class Main {
	
	public static void main(String[] args) {
		//phụ thuộc vào kiểu cha của Provider
		Animal animal = null;
		
		//tạo đối tượng Ếch
		//vì muốn gửi thông điệp đến hành vi jump()
		//của Ếch - Frog
		animal = new Frog("Tèo");
		
		//gửi thông điệp gián tiếp
		animal.jump();
		
		animal = new Kangaroo("Tý", 5);
		//gửi thông điệp gián tiếp 
		//đến đối hành vi jump() tượng kangaroo
		animal.jump();
		
	}

}
