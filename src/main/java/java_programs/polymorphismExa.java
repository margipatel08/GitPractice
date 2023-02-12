package java_programs;

class Animal {
void Sound() {
		
		System.out.println("sound of Animal");
	}
}

class dog extends Animal 
{
	void Sound() {
		
		System.out.println("sound of Dog");
	}
}

class cat extends Animal 
{
	 void Sound() {
		System.out.println("sound of cat");
	}
}

class Horse extends Animal
{
	void Sound() {
		System.out.println("sound of Horse");
	}
}

class polymorphismExa{

	public static void main(String[] args) {
		
		Animal animal1;
		
		animal1=new cat();
		animal1.Sound();
		animal1=new dog();
		animal1.Sound();
		animal1=new Horse();
		animal1.Sound();
		
		
		

	}

}
