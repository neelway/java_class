
public class gen <t> {
	t obj;
	gen (t o){
		obj=o;
	}
	t getob(){
		return obj;
	}
	void show()
	{
		System.out.println("type of t is"+obj.getClass().getName());
	}
}
