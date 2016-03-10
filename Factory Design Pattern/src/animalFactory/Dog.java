package animalFactory;


public class Dog implements Animal 
{

	@Override
	public void locomotion() 
	{
		System.out.println("Dog Runs");
	}
	@Override
	public void makeSound() 
	{
		System.out.println("Woof, Woof");
	}

}
