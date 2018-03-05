
public abstract class Animal2 {

String name,color,breed;
Animal2()
{
	name = "dog";
	color = "red";
	breed="german shepherd";
}
void display()
{
	System.out.println(name);
	System.out.println(color);
	System.out.println(breed);
}
	
    abstract void eat();
    void speak()
    {
    	System.out.println("animal speak");
    }
    
	
}
