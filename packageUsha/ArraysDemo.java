package packageUsha;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int[] intarray ;
		intarray = new int[5];
		
		intarray[0]=55;
		intarray[1]=58;
		intarray[2]=56;
		intarray[3]=59;
		intarray[4]=50;
		
		int len = intarray.length;
		
		for (int i=0;i<len ; i++){
			 System.out.print(intarray[i] + " "); 
		 }
		
		
		intarray[0]=5;
		intarray[1]=8;
		
		
		for (int i=0;i<len ; i++){
			 System.out.println(intarray[i] + " "); 
		 }
		
		
		String[] stra = { "Hai" , "How", "are" , "you"};
		
		
		for(String a : stra){
			
			System.out.println(a);
		}
		
		Arrays.sort(intarray);
		
		for (int i=0;i<len ; i++){
			 System.out.print(intarray[i] + " "); 
		 }
		
		
		
	}

}
