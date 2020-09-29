package packageUsha;

public class ConceptStatic {
	
	static int a= 5;
	
	public static void main(String[] args) {
		
		
		ConceptStatic c1 = new ConceptStatic();
		c1.sumMethod(3);
		
	}
		
		public  void sumMethod( int num) {
			
			int result = a+num;
			System.out.println(result);
		}

	}


