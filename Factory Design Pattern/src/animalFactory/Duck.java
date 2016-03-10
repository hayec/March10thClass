package animalFactory;


public class Duck implements Animal
{

	@Override
	public void locomotion() 
	{
		System.out.println("Duck Waddles");
	}
	@Override
	public void makeSound()
	{
		System.out.println("Quack, Quack");
	}

}
