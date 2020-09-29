package packageUsha;

public class MethodsDemo {

	public static void main(String[] args) {
		
		/*String studname = "Usha";
		int score=90;
		String Grade;

		if(score<50)
		{
			
			Grade = "A";
			
		}else
		{
			Grade = "B";
		}
		System.out.println("Grade of " +studname +" is " + ":" +Grade);
	}*/


		String Grade;
		String studname1 ="Usha";
		int score1=95;
		Grade =gradeMethod(studname1,score1);
		System.out.println("Grade of " +studname1 +" is " + ":" +Grade);
	
		
		String studname2 ="Bu";
		int score2=75;
		Grade =gradeMethod(studname2,score2);
		System.out.println("Grade of " +studname2 +" is " + ":" +Grade);
		
		remarksMethod(Grade);
		
	}
		
	public static String gradeMethod(String studname1 , int score1)	{
		
		
		String Grade;
		
		if(score1<50)
		{
			
			Grade = "A";
			
		}else
		{
			Grade = "B";
		}
		
		return Grade;
		
	}
	
	public static void remarksMethod(String Grade){
		if(Grade=="B"){
			System.out.println("Very Good");
		}
		
	}
	
	
}
