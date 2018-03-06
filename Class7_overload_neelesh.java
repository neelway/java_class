
public class Class7_overload_neelesh extends a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class7_overload_neelesh t = new Class7_overload_neelesh();
		t.name();
		t.name(30);
		t.name(40.5f);
		
	
	}
	

}
class a{
		void name()
		{
			int i=1;
		System.out.println("no pera"+i);
		
		}
		void name(int j)
		{	
			System.out.println("int"+j);
		}
		void name(float k)
		{
			System.out.println("float"+k);
		}
}
