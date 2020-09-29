package packageUsha;

import java.util.Arrays;

public class UshaRevision {

	public static void main(String[] args) {
		
	/*	byte-
		short -32K - 32K
		int - -2L to 2L
		long- -2^63 to 2^63-1
		
		double
		float
		char-
		boolean
*/
		
		/*String str1 = "Usha";
		String str3 = "Usha" + "Hai";
		System.out.println(str1);
		String str2 = new String("Bhuvana");
		String str4 = new String("Bhuvana");*/
		
	/*	
		String str1 = "Hello";
		
		int[] a ;
		a= new int[5];
		
		int c[] = new int[10];
		
		
		a[0]=10;
		a[1]=40;
		a[2]=30;
		a[3]=90;
		a[4]=50;
		
		int[] b = {10,40,30,90,50};
		
		int arrayLength = a.length;
		System.out.println(arrayLength);
		
		for(int i =0; i<arrayLength; i++){
			
			System.out.println("The values are " +a[i]);
		}
		
		for(int a1 : a){
			System.out.println("For each loop  before sorting" +a1);
		}
			
			Arrays.sort(a);
			
			for(int a1 : a){
				System.out.println("For each loop  after sorting" +a1);
			}
			
			boolean result =Arrays.equals(a, b);
			System.out.println(result);*/
		
		String str1 = "HaiHello";
		String str2="Hello";
		String str5 = "";
		
		String str3 =str1.concat(str2);
		System.out.println(" " +str3);
		
		boolean result = str1.contains(str2);
		System.out.println(result);
		
		char a =str1.charAt(0);
		System.out.println(a);
		
		boolean result1 = str1.startsWith("H");
		System.out.println(result1);
		
		
		boolean result2 = str1.endsWith("llo");
		System.out.println(result2);
		
		boolean result3 =str1.equals(str2);
		System.out.println(result3);
		
		
		int index = str1.indexOf("H");
		System.out.println(index);
		
		boolean empty =str5.isEmpty();
		System.out.println(empty);
		
		
		String caseLower = str1.toLowerCase();
		System.out.println(caseLower);
		

		String upper = str1.toUpperCase();
		System.out.println(upper);
		
		String replace =str1.replace("H", "B");
		System.out.println(replace);
		
		String replace1=str1.replace("Hai", "How");
		System.out.println(replace1);
		
		
		String str7= "How are How";
		String c = str7.replaceAll("How", "Why");
		System.out.println(c);
		
		String subString = str7.substring(1,9);
		System.out.println(subString);
		
		String str10= "             kiran         ";
		
		String trim = str10.trim();
		
		System.out.println(trim);
		
		String array = "Hello";
		char[] chararray = array.toCharArray();
		
		for ( char i :chararray ){
			System.out.println(i);
		}
		
		/*String n = "Jolly";
		
		try{
		int j = Integer.parseInt("Jolly");
		System.out.println(j);
		}
		catch (Exception e){
			
			System.err.println(e.getMessage() + "Please enter a valid string");
		}*/
		
		
		String si = "100";
		/*int solution = Integer.parseInt(si);
		System.out.println(solution);
		*/
		
		int solution = Integer.valueOf(si);
		System.out.println(solution);
		
		
		int n = 700;
		/*String h = Integer.toString(n);
		System.out.println(h);
		*/
		
		String h =String.valueOf(n);
		System.out.println(h);
		
		}
	}


