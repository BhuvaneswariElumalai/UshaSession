package packageUsha;

public class StaticDemo {

	public static void main(String[] args) {
		
		ClassStatic bmw = new ClassStatic();
		System.out.println(bmw.getSpeed());
		System.out.println(bmw.getGear());
	    System.out.println(bmw.getInstanceNum());
	    
	    ClassStatic benz = new ClassStatic();
	    System.out.println(benz.getSpeed());
		System.out.println(benz.getGear());
	    System.out.println(benz.getInstanceNum());
	   System.out.println(benz.setInstanceNum(5));
	   
	    

	}

}
