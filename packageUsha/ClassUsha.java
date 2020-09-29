package packageUsha;

public class ClassUsha {

	public static void main(String[] args) {
		
	DemoCars c1 = new DemoCars();
	System.out.println(c1.getSpeed());
	System.out.println(c1.getGear());

	
	DemoCars c2 = new DemoCars(1,2);
	System.out.println(c2.getSpeed());
	System.out.println(c2.getGear());
	
	//public static void practice(){
		//System.out.println("This is a method session");
		
	}
}

