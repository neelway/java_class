
public class genric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gen <Integer> obj;
		obj=new gen<Integer>(32);
		
		
		int n =obj.getob();
		System.out.println(n);
		
		obj.show();
		System.out.println();
		
		
		gen<String> obj1;
		obj1=new gen<String>("neel");
		
		String s =obj1.getob();
		System.out.println(s);
		
		
		obj1.show();
		System.out.println();
		
		gen <Float> obj2;
		obj2=new gen<Float>(32.1f);
		
		
		Float f =obj2.getob();
		System.out.println(f);
		

		obj2.show();
		System.out.println();
		
		
		
		gen <Double> obj3;
		obj3=new gen<Double>(32.32);
		
		
		Double d =obj3.getob();
		System.out.println(d);
		

		obj3.show();
		System.out.println();
		

	}

}
