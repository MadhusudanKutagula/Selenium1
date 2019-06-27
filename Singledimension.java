package javaExamples;

public class Singledimension {

	public static void main(String[] args) {
		String[] names = new String []{"vani","suguna","Shankar"};
		
		for(String name : names){  //to know particular element of a string
			if(name=="suguna"){
			System.out.println(name);	
			}
			
			//System.out.println(name); //to print all elements 
		}
		
		//System.out.println(names[1]); //to print specific element of name array

	}

}
