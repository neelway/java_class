
public class genric2 <t>{
	t obj;
	genric2 (t o){
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
